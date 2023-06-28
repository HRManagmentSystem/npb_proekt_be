package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeEmploymentView;
import mk.ukim.finki.npb_proekt_be.service.EmployeeEmploymentViewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employeeEmploymentView")
@CrossOrigin("http://localhost:3000")
public class EmployeeEmploymentViewController {

    private final EmployeeEmploymentViewService employeeEmploymentViewService;

    @GetMapping("/first")
    public List<EmployeeEmploymentView> findFirstEmployeeEmploymentView(@RequestParam Integer n) {
        return this.employeeEmploymentViewService.findFirstEmployeeEmploymentView(n);
    }

    @GetMapping("/findById")
    public List<EmployeeEmploymentView> findEmployeesById(@RequestParam Integer id) {
        return this.employeeEmploymentViewService.findEmployeesById(id);
    }
}
