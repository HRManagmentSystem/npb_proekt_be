package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeProjectView;
import mk.ukim.finki.npb_proekt_be.service.EmployeeProjectViewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employeeProjectView")
public class EmployeeProjectViewController {

    private final EmployeeProjectViewService employeeProjectViewService;

    @GetMapping("")
    public List<EmployeeProjectView> findAllByEmployeeIdAndProjectId() {
        return this.employeeProjectViewService.findAllByEmployeeIdAndProjectId(39, 497666);
    }

}
