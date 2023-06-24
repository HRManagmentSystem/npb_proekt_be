package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeAddressInformation;
import mk.ukim.finki.npb_proekt_be.service.EmployeeAddressInformationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employeeAddressInformation")
public class EmployeeAddressInformationController {

    private final EmployeeAddressInformationService employeeAddressInformationService;

    @GetMapping("")
    List<EmployeeAddressInformation> findEmployeeAddressInformationByEmployeeIdAndPlaceId() {
        return this.employeeAddressInformationService.findEmployeeAddressInformationByEmployeeIdAndPlaceId(18799, 1);
    }

}
