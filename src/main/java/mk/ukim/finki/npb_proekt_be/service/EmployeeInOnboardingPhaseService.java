package mk.ukim.finki.npb_proekt_be.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeInOnboardingPhase;
import mk.ukim.finki.npb_proekt_be.repository.EmployeeFeedbacksRepo;
import mk.ukim.finki.npb_proekt_be.repository.EmployeeInOnboardingPhaseRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeInOnboardingPhaseService {

    private final EmployeeInOnboardingPhaseRepo employeeInOnboardingPhaseRepo;

    public List<EmployeeInOnboardingPhase> findFirstEmployeeInOnboardingPhase(Integer n) {
        return this.employeeInOnboardingPhaseRepo.findFirstEmployeeInOnboardingPhase(n);
    }

    public List<EmployeeInOnboardingPhase> findAllByEmployeeIdAndProgramId(Integer eId, Integer pId) {
        return this.employeeInOnboardingPhaseRepo.findAllByEmployeeIdAndProgramId(eId, pId);
    }
}
