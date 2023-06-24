package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.DepartmentProjects;
import mk.ukim.finki.npb_proekt_be.service.DepartmentProjectsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/departmentProjects")
public class DepartmentProjectsController {

    private final DepartmentProjectsService departmentProjectsService;

    @GetMapping("")
    public List<DepartmentProjects> findDepartmentProjectsByDepartment_id() {
        return this.departmentProjectsService.findDepartmentProjectsById(12, 446408);
    }

}
