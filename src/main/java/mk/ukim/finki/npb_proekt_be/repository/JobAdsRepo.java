package mk.ukim.finki.npb_proekt_be.repository;

import mk.ukim.finki.npb_proekt_be.model.JobAds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobAdsRepo extends JpaRepository<JobAds, Integer> {

    @Query(value = "select * from job_ads limit :n",nativeQuery = true)
    List<JobAds> findFirstJobAds(Integer n);

    List<JobAds> findJobAdsByJobAdId(Integer jobAdsId);

}
