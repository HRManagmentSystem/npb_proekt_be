package mk.ukim.finki.npb_proekt_be.repository;

import mk.ukim.finki.npb_proekt_be.model.EmployeeMostRecentPaymentView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeMostRecentPaymentViewRepo extends JpaRepository<EmployeeMostRecentPaymentView,Integer> {

    @Query(value = "select * from employee_most_recent_payment_view limit :n",nativeQuery = true)
    List<EmployeeMostRecentPaymentView> findFirstEmployeeMostRecentPaymentView(Integer n);

    List<EmployeeMostRecentPaymentView> findAllByEmployeeIdAndPaymentId(Integer eId,Integer pId);
}
