package mk.ukim.finki.npb_proekt_be.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeProjectView;
import mk.ukim.finki.npb_proekt_be.repository.EmployeeProjectViewRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeProjectViewService {

    private final EmployeeProjectViewRepo employeeProjectViewRepo;

    public List<EmployeeProjectView> findAllByEmployeeIdAndProjectId(Integer eId, Integer pId) {
        return this.employeeProjectViewRepo.findAllByEmployeeIdAndProjectId(eId, pId);
    }

}
