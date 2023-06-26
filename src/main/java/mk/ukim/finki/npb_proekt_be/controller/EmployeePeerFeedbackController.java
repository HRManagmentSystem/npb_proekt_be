package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeePeerFeedback;
import mk.ukim.finki.npb_proekt_be.service.EmployeePeerFeedbackService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employeePeerFeedback")
public class EmployeePeerFeedbackController {

    private final EmployeePeerFeedbackService employeePeerFeedbackService;

    @GetMapping("/first")
    public List<EmployeePeerFeedback> findFirstEmployeePeerFeedback(@RequestParam Integer n) {
        return this.employeePeerFeedbackService.findFirstEmployeePeerFeedback(n);
    }
}
