package mk.ukim.finki.npb_proekt_be.repository;

import mk.ukim.finki.npb_proekt_be.model.EmployeeMostRecentPaymentView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeMostRecentPaymentViewRepo extends JpaRepository<EmployeeMostRecentPaymentView,Integer> {

    List<EmployeeMostRecentPaymentView> findAllByEmployeeIdAndPaymentId(Integer eId,Integer pId);
}
