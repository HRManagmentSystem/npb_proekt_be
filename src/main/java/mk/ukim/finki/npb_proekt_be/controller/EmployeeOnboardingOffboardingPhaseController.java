package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeOnboardingOffboardingPhase;
import mk.ukim.finki.npb_proekt_be.service.EmployeeInOnboardingOffboardingPhaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employeeOnboardingOffboardingPhase")
@CrossOrigin("http://localhost:3000")
public class EmployeeOnboardingOffboardingPhaseController {

    private final EmployeeInOnboardingOffboardingPhaseService employeeInOnboardingOffboardingPhaseService;

    @GetMapping("/first")
    public List<EmployeeOnboardingOffboardingPhase> findFirstEmployeeInOnboardingPhase(@RequestParam Integer n) {
        return this.employeeInOnboardingOffboardingPhaseService.findFirstEmployeeInOnboardingPhase(n);
    }

    @GetMapping("/findById")
    public List<EmployeeOnboardingOffboardingPhase> findEmployeesById(@RequestParam Integer id){
        return this.employeeInOnboardingOffboardingPhaseService.findEmployeesById(id);
    }

    @PostMapping("/insertEmployee")
    public ResponseEntity<String> insertEmployee(@RequestParam String first_name,
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
        try{
            this.employeeInOnboardingOffboardingPhaseService.insertEmployee(first_name, last_name, birth, age, ssn, street, city, postal_code, country, onboarding_offboarding_program_id, work_location_id, suffix, phone, middle_name, email_address);
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
        return null;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        String errorMessage = "An error occurred: " + ex.getMessage();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
    }
}
