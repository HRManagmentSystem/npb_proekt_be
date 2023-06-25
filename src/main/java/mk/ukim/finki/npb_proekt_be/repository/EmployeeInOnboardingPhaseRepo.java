package mk.ukim.finki.npb_proekt_be.repository;

import mk.ukim.finki.npb_proekt_be.model.EmployeeInOnboardingPhase;
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
public interface EmployeeInOnboardingPhaseRepo extends JpaRepository<EmployeeInOnboardingPhase, Integer> {

    @Query(value = "select * from employee_in_onboarding_phase  limit :n",nativeQuery = true)
    List<EmployeeInOnboardingPhase> findFirstEmployeeInOnboardingPhase(Integer n);

    List<EmployeeInOnboardingPhase> findAllByEmployeeIdAndProgramId(Integer eId, Integer pId);

    @Modifying
    @Query(value = "call insert_employee("+
            ":first_name" +
            ",:last_name" +
            ",:date_of_birth" +
            ",:age" +
            ",:ssn" +
            ",:street" +
            ",:city" +
            ",:postal_code" +
            ",:country" +
            ",:onboarding_offboarding_program_id" +
            ",:work_location_id" +
            ",:suffix" +
            ",:phone" +
            ",:middle_name" +
            ",:email_address)", nativeQuery = true)
    void insertEmployee(@Param("first_name") String first_name, @Param("last_name") String last_name,
                        @Param("date_of_birth") Date date_of_birth, @Param("age") Integer age,
                        @Param("ssn") String ssn, @Param("street") String street,
                        @Param("city") String city, @Param("postal_code") String postal_code,
                        @Param("country") String country, @Param("onboarding_offboarding_program_id") Integer onboarding_offboarding_program_id,
                        @Param("work_location_id") Integer work_location_id, @Param("suffix") String suffix,
                        @Param("phone") String phone, @Param("middle_name") String middle_name,
                        @Param("email_address") String email_address);

}
