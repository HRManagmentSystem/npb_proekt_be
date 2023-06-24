package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeMostRecentPaymentView;
import mk.ukim.finki.npb_proekt_be.service.EmployeeMostRecentPaymentViewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employeeMostRecentPaymentView")
public class EmployeeMostRecentPaymentViewController {

    private final EmployeeMostRecentPaymentViewService employeeMostRecentPaymentViewService;

    @GetMapping("/first")
    public List<EmployeeMostRecentPaymentView> findFirstEmployeeMostRecentPaymentView(@RequestParam Integer n) {
        return this.employeeMostRecentPaymentViewService.findFirstEmployeeMostRecentPaymentView(n);
    }

    @GetMapping("")
    public List<EmployeeMostRecentPaymentView> findAllByEmployeeIdAndPaymentId(@RequestParam Integer eId, @RequestParam Integer pId) {
        return this.employeeMostRecentPaymentViewService.findAllByEmployeeIdAndPaymentId(eId, pId);
    }

}
