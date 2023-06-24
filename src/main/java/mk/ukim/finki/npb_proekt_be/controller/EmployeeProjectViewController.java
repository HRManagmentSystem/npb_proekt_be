package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeProjectView;
import mk.ukim.finki.npb_proekt_be.service.EmployeeProjectViewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employeeProjectView")
public class EmployeeProjectViewController {

    private final EmployeeProjectViewService employeeProjectViewService;

    @GetMapping("/first")
    public List<EmployeeProjectView> findFirstEmployeeProjectView(@RequestParam Integer n) {
        return this.employeeProjectViewService.findFirstEmployeeProjectView(n);
    }
    @GetMapping("")
    public List<EmployeeProjectView> findAllByEmployeeIdAndProjectId(@RequestParam Integer eId, @RequestParam Integer pId) {
        return this.employeeProjectViewService.findAllByEmployeeIdAndProjectId(eId, pId);
    }

}
