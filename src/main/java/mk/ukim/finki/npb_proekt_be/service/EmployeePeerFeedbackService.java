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

    public List<EmployeePeerFeedback> filterByIds(Integer id, Integer idQ, Integer idA) {
        return this.employeePeerFeedbackRepo.filterByIds(id, idQ, idA);
    }
}
