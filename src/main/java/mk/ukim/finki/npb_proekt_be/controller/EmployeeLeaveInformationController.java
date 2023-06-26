package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeLeaveInformation;
import mk.ukim.finki.npb_proekt_be.service.EmployeeLeaveInformationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employeeLeaveInformation")
public class EmployeeLeaveInformationController {

    private final EmployeeLeaveInformationService employeeLeaveInformationService;

    @GetMapping("/first")
    public List<EmployeeLeaveInformation> findFirstEmployeeLeaveInformation(@RequestParam Integer n) {
        return this.employeeLeaveInformationService.findFirstEmployeeLeaveInformation(n);
    }
}
