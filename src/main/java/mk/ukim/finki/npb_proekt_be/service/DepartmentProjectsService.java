package mk.ukim.finki.npb_proekt_be.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.DepartmentProjects;
import mk.ukim.finki.npb_proekt_be.repository.DepartmentProjectsRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartmentProjectsService {

    private final DepartmentProjectsRepo departmentProjectsRepo;

    public List<DepartmentProjects> findDepartmentProjectsById(Integer id, Integer pId) {
        return departmentProjectsRepo.findDepartmentProjectsByDepartmentIdAndProjectId(id, pId);
    }

    public List<DepartmentProjects> findFirstDepartmentProjects(Integer n) {
        return this.departmentProjectsRepo.findFirstDepartmentProjects(n);
    }
}
