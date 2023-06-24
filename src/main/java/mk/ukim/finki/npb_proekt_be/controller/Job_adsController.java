package mk.ukim.finki.npb_proekt_be.controller;

import mk.ukim.finki.npb_proekt_be.model.JobAds;
import mk.ukim.finki.npb_proekt_be.repository.JobAdsRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class Job_adsController {

    private final JobAdsRepo jobAdsRepo;

    public Job_adsController(JobAdsRepo jobAdsRepo) {
        this.jobAdsRepo = jobAdsRepo;
    }

    @GetMapping
    public List<JobAds> getAllJobs() {
        return jobAdsRepo.findJobAdsByJobAdId(3618495);
    }
}
