package mk.ukim.finki.npb_proekt_be.repository;

import mk.ukim.finki.npb_proekt_be.model.EmployeePeerFeedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeePeerFeedbackRepo extends JpaRepository<EmployeePeerFeedback, Integer> {

    @Query(value = "select * from employee_peer_feedback_view limit :n",nativeQuery = true)
    List<EmployeePeerFeedback> findFirstEmployeePeerFeedback(Integer n);

    @Query(value = "select * from employee_peer_feedback_view where evaluation_for_employee_id = :id and " +
            "peer_feedback_question_id = :idQ and answered_from_employee_id = :idA",nativeQuery = true)
    List<EmployeePeerFeedback> filterByIds(Integer id, Integer idQ, Integer idA);
}
