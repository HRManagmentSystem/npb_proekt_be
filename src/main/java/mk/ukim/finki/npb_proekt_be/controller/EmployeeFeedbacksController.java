package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeFeedbacks;
import mk.ukim.finki.npb_proekt_be.service.EmployeeFeedbacksService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employeeFeedbacks")
public class EmployeeFeedbacksController {

    private final EmployeeFeedbacksService employeeFeedbacksService;

    @GetMapping("/first")
    public List<EmployeeFeedbacks> findFirstEmployeeFeedbacks(@RequestParam Integer n){
        return this.employeeFeedbacksService.findFirstEmployeeFeedbacks(n);
    }

    @GetMapping("")
    public List<EmployeeFeedbacks> findAllByEmployeeIdAndPeerFeedbackIdAndPeerFeedbackQuestionAnswer(@RequestParam Integer eId, @RequestParam Integer pfId,@RequestParam Integer pfqaId) {
        return this.employeeFeedbacksService.findAllByEmployeeIdAndPeerFeedbackIdAndPeerFeedbackQuestionAnswer(eId ,pfId, pfqaId);
    }

}
