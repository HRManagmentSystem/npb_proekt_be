package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeLeaveView;
import mk.ukim.finki.npb_proekt_be.service.EmployeeLeaveViewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employeeLeaveView")
public class EmployeeLeaveViewController {

    private final EmployeeLeaveViewService employeeLeaveViewService;

    @GetMapping("/first")
    public List<EmployeeLeaveView> findFirstEmployeeLeaveView(@RequestParam Integer n) {
        return this.employeeLeaveViewService.findFirstEmployeeLeaveView(n);
    }

    @GetMapping("")
    public List<EmployeeLeaveView> findAllByEmployeeIdAndLeaveTypeId(@RequestParam Integer eId,@RequestParam Integer ltId){
        return this.employeeLeaveViewService.findAllByEmployeeIdAndLeaveTypeId(eId,ltId);
    }

}
