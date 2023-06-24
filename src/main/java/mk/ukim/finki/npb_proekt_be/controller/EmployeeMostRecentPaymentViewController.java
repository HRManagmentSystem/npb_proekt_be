package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeMostRecentPaymentView;
import mk.ukim.finki.npb_proekt_be.service.EmployeeMostRecentPaymentViewService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/paySlip")
    public void generatePaySlip(@RequestParam Integer employeeId,@RequestParam Integer month, @RequestParam Integer year, @RequestParam Integer bonus) {
        this.employeeMostRecentPaymentViewService.generatePaySlip(employeeId, month, year, bonus);
    }
}
