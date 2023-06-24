package mk.ukim.finki.npb_proekt_be.repository;

import mk.ukim.finki.npb_proekt_be.model.JobAds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobAdsRepo extends JpaRepository<JobAds, Integer> {

    List<JobAds> findJobAdsByJobAdId(Integer jobAdsId);

}
