package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeEmploymentView;
import mk.ukim.finki.npb_proekt_be.service.EmployeeEmploymentViewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employeeEmploymentView")
public class EmployeeEmploymentViewController {

    private final EmployeeEmploymentViewService employeeEmploymentViewService;

    @GetMapping("/first")
    public List<EmployeeEmploymentView> findFirstEmployeeEmploymentView(@RequestParam Integer n) {
        return this.employeeEmploymentViewService.findFirstEmployeeEmploymentView(n);
    }
}
