package mk.ukim.finki.npb_proekt_be.controller;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeFeedbacks;
import mk.ukim.finki.npb_proekt_be.service.EmployeeFeedbacksService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employeeFeedbacks")
public class EmployeeFeedbacksController {

    private final EmployeeFeedbacksService employeeFeedbacksService;

    @GetMapping("")
    public List<EmployeeFeedbacks> findAllByEmployeeIdAndPeerFeedbackIdAndPeerFeedbackQuestionAnswer() {
        return this.employeeFeedbacksService.findAllByEmployeeIdAndPeerFeedbackIdAndPeerFeedbackQuestionAnswer(21,5 , 3);
    }

}
