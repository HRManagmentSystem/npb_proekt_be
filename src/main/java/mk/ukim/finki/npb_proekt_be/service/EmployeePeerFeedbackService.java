package mk.ukim.finki.npb_proekt_be.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeePeerFeedback;
import mk.ukim.finki.npb_proekt_be.repository.EmployeePeerFeedbackRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeePeerFeedbackService {

    private final EmployeePeerFeedbackRepo employeePeerFeedbackRepo;

    public List<EmployeePeerFeedback> findFirstEmployeePeerFeedback(Integer n) {
        return this.employeePeerFeedbackRepo.findFirstEmployeePeerFeedback(n);
    }
}
