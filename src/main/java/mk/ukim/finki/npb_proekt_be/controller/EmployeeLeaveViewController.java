package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeLeaveView;
import mk.ukim.finki.npb_proekt_be.service.EmployeeLeaveViewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employeeLeaveView")
public class EmployeeLeaveViewController {

    private final EmployeeLeaveViewService employeeLeaveViewService;

    @GetMapping("")
    public List<EmployeeLeaveView> findAllByEmployeeIdAndLeaveTypeId(){
        return this.employeeLeaveViewService.findAllByEmployeeIdAndLeaveTypeId(16509,5);
    }

}
