package mk.ukim.finki.npb_proekt_be.repository;

import mk.ukim.finki.npb_proekt_be.model.EmployeeFeedbacks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeFeedbacksRepo extends JpaRepository<EmployeeFeedbacks, Integer> {

    List<EmployeeFeedbacks> findAllByEmployeeIdAndPeerFeedbackIdAndPeerFeedbackQuestionAnswer(Integer eId, Integer pfId, Integer pfqaId);

}
