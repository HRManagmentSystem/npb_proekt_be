package mk.ukim.finki.npb_proekt_be.repository;

import mk.ukim.finki.npb_proekt_be.model.EmployeeFeedbacks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeFeedbacksRepo extends JpaRepository<EmployeeFeedbacks, Integer> {

    @Query(value = "select * from employee_feedbacks limit :n",nativeQuery = true)
    List<EmployeeFeedbacks> findFirstEmployeeFeedbacks(Integer n);

    List<EmployeeFeedbacks> findAllByEmployeeIdAndPeerFeedbackIdAndPeerFeedbackQuestionAnswer(Integer eId, Integer pfId, Integer pfqaId);

}
