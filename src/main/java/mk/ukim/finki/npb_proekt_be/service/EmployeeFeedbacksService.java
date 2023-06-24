package mk.ukim.finki.npb_proekt_be.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeFeedbacks;
import mk.ukim.finki.npb_proekt_be.repository.EmployeeFeedbacksRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeFeedbacksService {

    private final EmployeeFeedbacksRepo employeeFeedbacksRepo;

    public List<EmployeeFeedbacks> findAllByEmployeeIdAndPeerFeedbackIdAndPeerFeedbackQuestionAnswer(Integer eId, Integer pfId, Integer pfqaId) {
        return this.employeeFeedbacksRepo.findAllByEmployeeIdAndPeerFeedbackIdAndPeerFeedbackQuestionAnswer(eId,pfId,pfqaId);
    }

}
