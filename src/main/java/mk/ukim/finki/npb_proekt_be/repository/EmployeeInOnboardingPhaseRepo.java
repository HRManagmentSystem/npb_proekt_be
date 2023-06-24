package mk.ukim.finki.npb_proekt_be.repository;

import mk.ukim.finki.npb_proekt_be.model.EmployeeInOnboardingPhase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeInOnboardingPhaseRepo extends JpaRepository<EmployeeInOnboardingPhase, Integer> {

    List<EmployeeInOnboardingPhase> findAllByEmployeeIdAndProgramId(Integer eId, Integer pId);

}
