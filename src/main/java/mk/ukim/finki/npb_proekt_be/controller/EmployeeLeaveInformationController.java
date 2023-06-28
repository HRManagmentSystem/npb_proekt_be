package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeLeaveInformation;
import mk.ukim.finki.npb_proekt_be.service.EmployeeLeaveInformationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employeeLeaveInformation")
@CrossOrigin("http://localhost:3000")
public class EmployeeLeaveInformationController {

    private final EmployeeLeaveInformationService employeeLeaveInformationService;

    @GetMapping("/first")
    public List<EmployeeLeaveInformation> findFirstEmployeeLeaveInformation(@RequestParam Integer n) {
        return this.employeeLeaveInformationService.findFirstEmployeeLeaveInformation(n);
    }

    @GetMapping("/filterById")
    public List<EmployeeLeaveInformation> findFirstEmployeeLeaveInformation(@RequestParam Integer id,@RequestParam Integer ltId,@RequestParam Integer fd){
        return this.employeeLeaveInformationService.filterEmployeeLeaveInformation(id, ltId, fd);
    }
}
