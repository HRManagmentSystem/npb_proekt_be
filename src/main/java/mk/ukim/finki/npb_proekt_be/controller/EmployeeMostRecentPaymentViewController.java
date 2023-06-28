package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeMostRecentPaymentView;
import mk.ukim.finki.npb_proekt_be.service.EmployeeMostRecentPaymentViewService;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employeeMostRecentPaymentView")
@CrossOrigin("http://localhost:3000")
public class EmployeeMostRecentPaymentViewController {

    private final EmployeeMostRecentPaymentViewService employeeMostRecentPaymentViewService;

    @GetMapping("/first")
    public List<EmployeeMostRecentPaymentView> findFirstEmployeeMostRecentPaymentView(@RequestParam Integer n) {
        return this.employeeMostRecentPaymentViewService.findFirstEmployeeMostRecentPaymentView(n);
    }

    @GetMapping("findById")
    public List<EmployeeMostRecentPaymentView> findByEmployeeIdandMostResentPaymentChangeDate(@RequestParam Integer id,@RequestParam String date) throws ParseException {
        Date d = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        return this.employeeMostRecentPaymentViewService.findByEmployeeIdandMostResentPaymentChangeDate(id, d);
    }

    @PostMapping("/paySlip")
    public void generatePaySlip(@RequestParam Integer employeeId,@RequestParam Integer month, @RequestParam Integer year, @RequestParam Integer bonus) {
        this.employeeMostRecentPaymentViewService.generatePaySlip(employeeId, month, year, bonus);
    }
}
