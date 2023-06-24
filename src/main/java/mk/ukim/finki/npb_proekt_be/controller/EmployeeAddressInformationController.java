package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeAddressInformation;
import mk.ukim.finki.npb_proekt_be.service.EmployeeAddressInformationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employeeAddressInformation")
public class EmployeeAddressInformationController {

    private final EmployeeAddressInformationService employeeAddressInformationService;

    @GetMapping("/first")
    public List<EmployeeAddressInformation> findFirstEmployeeAddressInformation(@RequestParam Integer n) {
        return this.employeeAddressInformationService.findFirstEmployeeAddressInformation(n);
    }

    @GetMapping("")
    List<EmployeeAddressInformation> findEmployeeAddressInformationByEmployeeIdAndPlaceId(@RequestParam Integer eId, @RequestParam Integer pId) {
        return this.employeeAddressInformationService.findEmployeeAddressInformationByEmployeeIdAndPlaceId(eId, pId);
    }

}
