package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeProjectView;
import mk.ukim.finki.npb_proekt_be.service.EmployeeProjectViewService;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employeeProjectView")
@CrossOrigin("http://localhost:3000")
public class EmployeeProjectViewController {

    private final EmployeeProjectViewService employeeProjectViewService;

    @GetMapping("/first")
    public List<EmployeeProjectView> findFirstEmployeeProjectView(@RequestParam Integer n) {
        return this.employeeProjectViewService.findFirstEmployeeProjectView(n);
    }
    @GetMapping("/filterById")
    public List<EmployeeProjectView> findAllByEmployeeIdAndProjectIdAndDepartmentId(@RequestParam Integer eId,@RequestParam Integer pId,@RequestParam Integer dId){
        return this.employeeProjectViewService.findAllByEmployeeIdAndProjectIdAndDepartmentId(eId, pId, dId);
    }

    @PostMapping("/insertEmployeeProjectPosition")
    public void insertEmployeeProjectPosition(
            @RequestParam Integer employee,
            @RequestParam Integer project,
            @RequestParam Integer project_position,
            @RequestParam Integer reports_to_project_hierarchy,
            @RequestParam String from_date_project,
            @RequestParam Boolean if_exists_update
    ) throws ParseException {
        Date from_date = new SimpleDateFormat("yyyy-MM-dd").parse(from_date_project);
        this.employeeProjectViewService.insertEmployeeProjectPosition(employee, project, project_position, reports_to_project_hierarchy, from_date, if_exists_update);
    }

}
