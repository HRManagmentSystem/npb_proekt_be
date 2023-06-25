package mk.ukim.finki.npb_proekt_be.repository;

import mk.ukim.finki.npb_proekt_be.model.EmployeeLeaveView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
@Transactional
public interface EmployeeLeaveViewRepo extends JpaRepository<EmployeeLeaveView,Integer> {

    @Query(value = "select * from employee_leave_view  limit :n",nativeQuery = true)
    List<EmployeeLeaveView> findFirstEmployeeLeaveView(Integer n);

    List<EmployeeLeaveView> findAllByEmployeeIdAndLeaveTypeId(Integer eId, Integer ltId);

    @Modifying
    @Query(value = "call insert_leave(:employee, :leave_type, :reason_for_leave, :start_date, :end_date)", nativeQuery = true)
    void insertEmployeeLeave(@Param("employee") Integer employee,@Param("leave_type") Integer leave_type,@Param("reason_for_leave") Integer reason_for_leave,@Param("start_date") Date start_date,@Param("end_date") Date end_date);
}
