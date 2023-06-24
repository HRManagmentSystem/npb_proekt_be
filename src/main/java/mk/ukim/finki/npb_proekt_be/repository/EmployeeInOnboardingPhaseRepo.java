package mk.ukim.finki.npb_proekt_be.repository;

import mk.ukim.finki.npb_proekt_be.model.EmployeeInOnboardingPhase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeInOnboardingPhaseRepo extends JpaRepository<EmployeeInOnboardingPhase, Integer> {

    @Query(value = "select * from employee_in_onboarding_phase  limit :n",nativeQuery = true)
    List<EmployeeInOnboardingPhase> findFirstEmployeeInOnboardingPhase(Integer n);

    List<EmployeeInOnboardingPhase> findAllByEmployeeIdAndProgramId(Integer eId, Integer pId);

}
