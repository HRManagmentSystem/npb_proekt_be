package mk.ukim.finki.npb_proekt_be.repository;

import mk.ukim.finki.npb_proekt_be.model.JobAds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Repository
@Transactional
public interface JobAdsRepo extends JpaRepository<JobAds, Integer> {

    @Query(value = "select * from job_ads limit :n",nativeQuery = true)
    List<JobAds> findFirstJobAds(Integer n);

    List<JobAds> findJobAdsByJobAdId(Integer jobAdsId);

    @Modifying
    @Query(value = "call insert_job_ad(:urgency_passed, :description_passed,:date_opened_passed,:work_location,:work_place,:if_exists_update)", nativeQuery = true)
    void insertJobAd(@Param("urgency_passed") String urgency_passed,
                     @Param("description_passed") String description_passed,
                     @Param("date_opened_passed")Date date_opened_passed,
                     @Param("work_location") Integer work_location,
                     @Param("work_place")Integer work_place,
                     @Param("if_exists_update") Boolean if_exists_update);
    // worklocation - 1:30 , work_place - 1:165
    
    @Modifying
    @Query(value = "call application_submission(:application_description, :attached_document_subject, :attached_document_file_type, :attached_document_type, :attached_document_date, :attached_document_content," +
            " :applicant_ssn, :applicant_name, :applicant_surname, :applicant_date_of_birth, :applicant_email, :applicant_phone, :applicant_city, :applicant_country, " +
            ":applicant_highest_education, :applicant_work_experience, :applied_for_job_ad_id)", nativeQuery = true)
    void applicationSubmission(@Param("application_description")String application_description,
                               @Param("attached_document_subject")String attached_document_subject,
                               @Param("attached_document_file_type")String attached_document_file_type,
                               @Param("attached_document_type")String attached_document_type,
                               @Param("attached_document_date")Date attached_document_date,
                               @Param("attached_document_content")String attached_document_content,
                               @Param("applicant_ssn")String applicant_ssn,
                               @Param("applicant_name")String applicant_name,
                               @Param("applicant_surname")String applicant_surname,
                               @Param("applicant_date_of_birth")Date applicant_date_of_birth,
                               @Param("applicant_email")String applicant_email,
                               @Param("applicant_phone")String applicant_phone,
                               @Param("applicant_city")String applicant_city,
                               @Param("applicant_country")String applicant_country,
                               @Param("applicant_highest_education")String applicant_highest_education,
                               @Param("applicant_work_experience")String applicant_work_experience,
                               @Param("applied_for_job_ad_id")Integer applied_for_job_ad_id
    );

}
