package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeAddressInformation;
import mk.ukim.finki.npb_proekt_be.service.EmployeeAddressInformationService;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employeeAddressInformation")
@CrossOrigin("http://localhost:3000")
public class EmployeeAddressInformationController {

    private final EmployeeAddressInformationService employeeAddressInformationService;

    @GetMapping("/first")
    public List<EmployeeAddressInformation> findFirstEmployeeAddressInformation(@RequestParam Integer n) {
        return this.employeeAddressInformationService.findFirstEmployeeAddressInformation(n);
    }

    @GetMapping("")
    public List<EmployeeAddressInformation> findEmployeeAddressInformationByEmployeeIdAndPlaceId(@RequestParam Integer eId, @RequestParam Integer pId) {
        return this.employeeAddressInformationService.findEmployeeAddressInformationByEmployeeIdAndPlaceId(eId, pId);
    }

    @PostMapping("/changeEmployeeStatus")
    public void changeEmployeeStatus(@RequestParam Integer employee,@RequestParam String employee_status,@RequestParam String effective_date) throws ParseException {
        Date effective = new SimpleDateFormat("yyyy-MM-dd").parse(effective_date);
        this.employeeAddressInformationService.changeEmployeeStatus(employee, employee_status, effective);
    }

}
