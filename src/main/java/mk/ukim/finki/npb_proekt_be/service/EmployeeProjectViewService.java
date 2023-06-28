package mk.ukim.finki.npb_proekt_be.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeProjectView;
import mk.ukim.finki.npb_proekt_be.repository.EmployeeProjectViewRepo;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeProjectViewService {

    private final EmployeeProjectViewRepo employeeProjectViewRepo;

    public List<EmployeeProjectView> findFirstEmployeeProjectView(Integer n) {
        return this.employeeProjectViewRepo.findFirstEmployeeProjectView(n);
    }

    public List<EmployeeProjectView> findAllByEmployeeIdAndProjectIdAndDepartmentId(Integer eId,Integer pId,Integer dId){
        return this.employeeProjectViewRepo.findAllByEmployeeIdAndProjectIdAndDepartmentId(eId, pId, dId);
    }

    public void insertEmployeeProjectPosition(
            Integer employee,
            Integer project,
            Integer project_position,
            Integer reports_to_project_hierarchy,
            Date from_date_project,
            Boolean if_exists_update
    ) {
        this.employeeProjectViewRepo.insertEmployeeProjectPosition(employee, project, project_position, reports_to_project_hierarchy, from_date_project, if_exists_update);
    }

}
