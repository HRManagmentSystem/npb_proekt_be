package mk.ukim.finki.npb_proekt_be.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeLeaveInformation;
import mk.ukim.finki.npb_proekt_be.repository.EmployeeLeaveInformationRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeLeaveInformationService {

    private final EmployeeLeaveInformationRepo employeeLeaveInformationRepo;

    public List<EmployeeLeaveInformation> findFirstEmployeeLeaveInformation(Integer n) {
        return this.employeeLeaveInformationRepo.findFirstEmployeeLeaveInformation(n);
    }
}
