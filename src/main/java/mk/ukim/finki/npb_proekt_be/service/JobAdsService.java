package mk.ukim.finki.npb_proekt_be.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.JobAds;
import mk.ukim.finki.npb_proekt_be.repository.JobAdsRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class JobAdsService {
    private final JobAdsRepo jobAdsRepo;

    public List<JobAds> findJobsById(Integer jobAdsId) {
        return this.jobAdsRepo.findJobAdsByJobAdId(jobAdsId);
    }

}
