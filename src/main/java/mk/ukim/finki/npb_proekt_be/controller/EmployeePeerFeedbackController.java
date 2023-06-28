package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeePeerFeedback;
import mk.ukim.finki.npb_proekt_be.service.EmployeePeerFeedbackService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employeePeerFeedback")
@CrossOrigin("http://localhost:3000")
public class EmployeePeerFeedbackController {

    private final EmployeePeerFeedbackService employeePeerFeedbackService;

    @GetMapping("/first")
    public List<EmployeePeerFeedback> findFirstEmployeePeerFeedback(@RequestParam Integer n) {
        return this.employeePeerFeedbackService.findFirstEmployeePeerFeedback(n);
    }

    @GetMapping("filterById")
    public List<EmployeePeerFeedback> filterByIds(@RequestParam Integer id,@RequestParam Integer idQ,@RequestParam Integer idA) {
        return this.employeePeerFeedbackService.filterByIds(id, idQ, idA);
    }
}
