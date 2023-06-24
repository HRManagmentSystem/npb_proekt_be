package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeMostRecentPaymentView;
import mk.ukim.finki.npb_proekt_be.service.EmployeeMostRecentPaymentViewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employeeMostRecentPaymentView")
public class EmployeeMostRecentPaymentViewController {

    private final EmployeeMostRecentPaymentViewService employeeMostRecentPaymentViewService;

    @GetMapping("")
    public List<EmployeeMostRecentPaymentView> findAllByEmployeeIdAndPaymentId() {
        return this.employeeMostRecentPaymentViewService.findAllByEmployeeIdAndPaymentId(44, 2019);
    }

}
