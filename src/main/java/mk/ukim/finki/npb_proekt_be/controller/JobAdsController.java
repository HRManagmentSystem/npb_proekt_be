package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.JobAds;
import mk.ukim.finki.npb_proekt_be.repository.JobAdsRepo;
import mk.ukim.finki.npb_proekt_be.service.JobAdsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/jobs")
public class JobAdsController {

    private final JobAdsService jobAdsService;

    @GetMapping("/first")
    public List<JobAds> findFirstJobAds(@RequestParam Integer n) {
        return this.jobAdsService.findFirstJobAds(n);
    }

    @GetMapping("")
    public List<JobAds> getAllJobs(@RequestParam Integer jobAdsId) {
        return jobAdsService.findJobsById(jobAdsId);
    }
}
