package mk.ukim.finki.npb_proekt_be.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeInOnboardingPhase;
import mk.ukim.finki.npb_proekt_be.repository.EmployeeFeedbacksRepo;
import mk.ukim.finki.npb_proekt_be.repository.EmployeeInOnboardingPhaseRepo;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.Date;
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

    public void insertEmployee(String first_name, String last_name,
                               Date date_of_birth, Integer age,
                               String ssn, String street,
                               String city, String postal_code,
                               String country, Integer onboarding_offboarding_program_id,
                               Integer work_location_id, String suffix,
                               String phone, String middle_name,
                               String email_address) {
        this.employeeInOnboardingPhaseRepo.insertEmployee(first_name, last_name, date_of_birth, age, ssn, street, city, postal_code, country, onboarding_offboarding_program_id, work_location_id, suffix, phone, middle_name, email_address);
    }
}
