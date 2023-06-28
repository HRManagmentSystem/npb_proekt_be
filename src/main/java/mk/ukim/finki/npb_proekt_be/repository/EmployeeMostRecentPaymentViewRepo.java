package mk.ukim.finki.npb_proekt_be.repository;

import mk.ukim.finki.npb_proekt_be.model.EmployeeMostRecentPaymentView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Repository
@Transactional
public interface EmployeeMostRecentPaymentViewRepo extends JpaRepository<EmployeeMostRecentPaymentView,Integer> {

    @Query(value = "select * from employee_most_recent_payment_view limit :n",nativeQuery = true)
    List<EmployeeMostRecentPaymentView> findFirstEmployeeMostRecentPaymentView(Integer n);

    @Query(value = "select * from employee_most_recent_payment_view where employee_id = :id and most_resent_payment_change_date = :date",nativeQuery = true)
    List<EmployeeMostRecentPaymentView> findByEmployeeIdandMostResentPaymentChangeDate(Integer id, Date date);

    @Modifying
    @Query(value = "call generate_pay_slip(:employeeId,:month, :year, :bonus)", nativeQuery = true)
    void generatePaySlip(@Param("employeeId") Integer employeeId, @Param("month")Integer month, @Param("year")Integer year,@Param("bonus")Integer bonus);
}
