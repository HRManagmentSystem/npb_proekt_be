package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeEquipmentView;
import mk.ukim.finki.npb_proekt_be.service.EmployeeEquipmentViewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employeeEquipmentView")
public class EmployeeEquipmentViewController {

    private final EmployeeEquipmentViewService employeeEquipmentViewService;

    @GetMapping("/first")
    public List<EmployeeEquipmentView> findFirstEmployeeEquipmentView(Integer n) {
        return this.employeeEquipmentViewService.findFirstEmployeeEquipmentView(n);
    }

    @GetMapping("")
    public List<EmployeeEquipmentView> findEmployeeEquipmentViewByEmployeeIdAndEquipmentId(@RequestParam Integer eId, @RequestParam Integer eqId) {
        return this.employeeEquipmentViewService.findEmployeeEquipmentViewByEmployeeIdAndEquipmentId(eId, eqId);
    }

}
