package mk.ukim.finki.npb_proekt_be.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeEmploymentView;
import mk.ukim.finki.npb_proekt_be.repository.EmployeeEmploymentViewRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeEmploymentViewService {

    private final EmployeeEmploymentViewRepo employeeEmploymentViewRepo;

    public List<EmployeeEmploymentView> findFirstEmployeeEmploymentView(Integer n) {
        return this.employeeEmploymentViewRepo.findFirstEmployeeEmploymentView(n);
    }
}
