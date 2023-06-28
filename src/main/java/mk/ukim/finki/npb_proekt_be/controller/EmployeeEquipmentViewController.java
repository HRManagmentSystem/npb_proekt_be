package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeEquipmentView;
import mk.ukim.finki.npb_proekt_be.service.EmployeeEquipmentViewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employeeEquipmentView")
@CrossOrigin("http://localhost:3000")
public class EmployeeEquipmentViewController {

    private final EmployeeEquipmentViewService employeeEquipmentViewService;

    @GetMapping("/first")
    public List<EmployeeEquipmentView> findFirstEmployeeEquipmentView(@RequestParam Integer n) {
        return this.employeeEquipmentViewService.findFirstEmployeeEquipmentView(n);
    }

    @GetMapping("/filterById")
    public List<EmployeeEquipmentView> findEmployeeEquipmentViewByEmployeeIdAndEquipmentId(@RequestParam Integer eId, @RequestParam Integer eqId) {
        return this.employeeEquipmentViewService.findEmployeeEquipmentViewByEmployeeIdAndEquipmentId(eId, eqId);
    }

}
