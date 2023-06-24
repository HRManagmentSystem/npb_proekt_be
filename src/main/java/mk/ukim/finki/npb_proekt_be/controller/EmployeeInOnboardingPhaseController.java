package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeInOnboardingPhase;
import mk.ukim.finki.npb_proekt_be.service.EmployeeInOnboardingPhaseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employeeInOnboardingPhase")
public class EmployeeInOnboardingPhaseController {

    private final EmployeeInOnboardingPhaseService employeeInOnboardingPhaseService;

    @GetMapping("")
    public List<EmployeeInOnboardingPhase> findAllByEmployeeIdAndProgramId() {
        return this.employeeInOnboardingPhaseService.findAllByEmployeeIdAndProgramId(1, 1);
    }
}
