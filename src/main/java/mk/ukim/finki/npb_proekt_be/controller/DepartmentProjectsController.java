package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.DepartmentProjects;
import mk.ukim.finki.npb_proekt_be.service.DepartmentProjectsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/departmentProjects")
@CrossOrigin("http://localhost:3000")
public class DepartmentProjectsController {

    private final DepartmentProjectsService departmentProjectsService;

    @GetMapping("/first")
    public List<DepartmentProjects> findFirstDepartmentProjects(@RequestParam Integer n) {
        return this.departmentProjectsService.findFirstDepartmentProjects(n);
    }
    
    @GetMapping("")
    public List<DepartmentProjects> findDepartmentProjectsByDepartment_id(@RequestParam Integer id, @RequestParam Integer pId) {
        return this.departmentProjectsService.findDepartmentProjectsById(id, pId);
    }
}
