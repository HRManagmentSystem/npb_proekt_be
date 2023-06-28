package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.JobAds;
import mk.ukim.finki.npb_proekt_be.repository.JobAdsRepo;
import mk.ukim.finki.npb_proekt_be.service.JobAdsService;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/jobs")
@CrossOrigin("http://localhost:3000")
public class JobAdsController {

    private final JobAdsService jobAdsService;

    @GetMapping("/first")
    public List<JobAds> findFirstJobAds(@RequestParam Integer n) {
        return this.jobAdsService.findFirstJobAds(n);
    }

    @GetMapping("/filterById")
    public List<JobAds> findJobsByWorklocationid(Integer id){
        return this.jobAdsService.findJobsByWorklocationid(id);
    }

    @PostMapping("/insertJobAd")
    public void insertJobAd(@RequestParam String urgency_passed,
                            @RequestParam String description_passed,
                            @RequestParam String date_opened_passed,
                            @RequestParam Integer work_location,
                            @RequestParam Integer work_place,
                            @RequestParam Boolean if_exists_update) throws ParseException {
        Date date_opened = new SimpleDateFormat("yyyy-MM-dd").parse(date_opened_passed);
        this.jobAdsService.insertJobAd(urgency_passed, description_passed, date_opened, work_location, work_place, if_exists_update);
    }

    @PostMapping("/applicationSubmission")
    public void applicationSubmission(@RequestParam String application_description,
                                      @RequestParam String attached_document_subject,
                                      @RequestParam String attached_document_file_type,
                                      @RequestParam String attached_document_type,
                                      @RequestParam String attached_document_date,
                                      @RequestParam String attached_document_content,
                                      @RequestParam String applicant_ssn,
                                      @RequestParam String applicant_name,
                                      @RequestParam String applicant_surname,
                                      @RequestParam String applicant_date_of_birth,
                                      @RequestParam String applicant_email,
                                      @RequestParam String applicant_phone,
                                      @RequestParam String applicant_city,
                                      @RequestParam String applicant_country,
                                      @RequestParam String applicant_highest_education,
                                      @RequestParam String applicant_work_experience,
                                      @RequestParam Integer applied_for_job_ad_id
    ) throws ParseException {
        Date date_attached = new SimpleDateFormat("yyyy-MM-dd").parse(attached_document_date);
        Date applicant_birth = new SimpleDateFormat("yyyy-MM-dd").parse(applicant_date_of_birth);
        this.jobAdsService.applicationSubmission(application_description, attached_document_subject, attached_document_file_type, attached_document_type, date_attached, attached_document_content, applicant_ssn, applicant_name, applicant_surname, applicant_birth, applicant_email, applicant_phone, applicant_city, applicant_country, applicant_highest_education, applicant_work_experience, applied_for_job_ad_id);
    }
}
