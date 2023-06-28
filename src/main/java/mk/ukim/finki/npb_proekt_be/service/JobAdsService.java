package mk.ukim.finki.npb_proekt_be.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.JobAds;
import mk.ukim.finki.npb_proekt_be.repository.JobAdsRepo;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class JobAdsService {
    private final JobAdsRepo jobAdsRepo;

    public List<JobAds> findFirstJobAds(Integer n) {
        return this.jobAdsRepo.findFirstJobAds(n);
    }

    public List<JobAds> findJobsByWorklocationid(Integer id){
        return this.jobAdsRepo.findJobsByWorklocationid(id);
    }

   public void insertJobAd(String urgency_passed,
                     String description_passed,
                     Date date_opened_passed,
                     Integer work_location,
                     Integer work_place,
                     Boolean if_exists_update) throws Exception {
        try{
            this.jobAdsRepo.insertJobAd(urgency_passed, description_passed, date_opened_passed, work_location, work_place, if_exists_update);
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
   }

   public void applicationSubmission(String application_description,
                                     String attached_document_subject,
                                     String attached_document_file_type,
                                     String attached_document_type,
                                     Date attached_document_date,
                                     String attached_document_content,
                                     String applicant_ssn,
                                     String applicant_name,
                                     String applicant_surname,
                                     Date applicant_date_of_birth,
                                     String applicant_email,
                                     String applicant_phone,
                                     String applicant_city,
                                     String applicant_country,
                                     String applicant_highest_education,
                                     String applicant_work_experience,
                                     Integer applied_for_job_ad_id
   ) throws Exception {
        try{
            this.jobAdsRepo.applicationSubmission(application_description, attached_document_subject, attached_document_file_type, attached_document_type, attached_document_date, attached_document_content, applicant_ssn, applicant_name, applicant_surname, applicant_date_of_birth, applicant_email, applicant_phone, applicant_city, applicant_country, applicant_highest_education, applicant_work_experience, applied_for_job_ad_id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
   }

}
