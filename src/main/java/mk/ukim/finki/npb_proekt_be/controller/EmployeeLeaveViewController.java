package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeLeaveView;
import mk.ukim.finki.npb_proekt_be.service.EmployeeLeaveViewService;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employeeLeaveView")
@CrossOrigin("http://localhost:3000")
public class EmployeeLeaveViewController {

    private final EmployeeLeaveViewService employeeLeaveViewService;

    @GetMapping("/first")
    public List<EmployeeLeaveView> findFirstEmployeeLeaveView(@RequestParam Integer n) {
        return this.employeeLeaveViewService.findFirstEmployeeLeaveView(n);
    }

    @GetMapping("/filterById")
    public List<EmployeeLeaveView> findAllByEmployeeIdAndLeaveTypeId(@RequestParam Integer eId, @RequestParam Integer ltId) {
        return this.employeeLeaveViewService.findAllByEmployeeIdAndLeaveTypeId(eId, ltId);
    }

    @PostMapping("/insertLeave")
    public void insertEmployeeLeave(@RequestParam Integer employee, @RequestParam Integer leave_type, @RequestParam Integer reason_for_leave, @RequestParam String start_date,@RequestParam String end_date) throws ParseException {
        Date start = new SimpleDateFormat("yyyy-MM-dd").parse(start_date);
        Date end = new SimpleDateFormat("yyyy-MM-dd").parse(end_date);
        this.employeeLeaveViewService.insertEmployeeLeave(employee, leave_type, reason_for_leave, start, end);
    }
}
