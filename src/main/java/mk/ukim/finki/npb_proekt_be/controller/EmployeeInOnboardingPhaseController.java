package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeInOnboardingPhase;
import mk.ukim.finki.npb_proekt_be.service.EmployeeInOnboardingPhaseService;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employeeInOnboardingPhase")
public class EmployeeInOnboardingPhaseController {

    private final EmployeeInOnboardingPhaseService employeeInOnboardingPhaseService;

    @GetMapping("/first")
    public List<EmployeeInOnboardingPhase> findFirstEmployeeInOnboardingPhase(@RequestParam Integer n) {
        return this.employeeInOnboardingPhaseService.findFirstEmployeeInOnboardingPhase(n);
    }

    @GetMapping("")
    public List<EmployeeInOnboardingPhase> findAllByEmployeeIdAndProgramId(@RequestParam Integer eId, @RequestParam Integer pId) {
        return this.employeeInOnboardingPhaseService.findAllByEmployeeIdAndProgramId(eId, pId);
    }

    @PostMapping("/insertEmployee")
    public void insertEmployee(@RequestParam String first_name,
                               @RequestParam String last_name,
                               @RequestParam String date_of_birth,
                               @RequestParam Integer age,
                               @RequestParam String ssn,
                               @RequestParam String street,
                               @RequestParam String city,
                               @RequestParam String postal_code,
                               @RequestParam String country,
                               @RequestParam Integer onboarding_offboarding_program_id,
                               @RequestParam Integer work_location_id,
                               @RequestParam String suffix,
                               @RequestParam String phone,
                               @RequestParam String middle_name,
                               @RequestParam String email_address) throws ParseException {
        Date birth = new SimpleDateFormat("yyyy-MM-dd").parse(date_of_birth);
        this.employeeInOnboardingPhaseService.insertEmployee(first_name, last_name, birth, age, ssn, street, city, postal_code, country, onboarding_offboarding_program_id, work_location_id, suffix, phone, middle_name, email_address);
    }
}
