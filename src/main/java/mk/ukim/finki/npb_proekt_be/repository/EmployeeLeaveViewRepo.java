package mk.ukim.finki.npb_proekt_be.repository;

import mk.ukim.finki.npb_proekt_be.model.EmployeeLeaveView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface EmployeeLeaveViewRepo extends JpaRepository<EmployeeLeaveView,Integer> {

    List<EmployeeLeaveView> findAllByEmployeeIdAndLeaveTypeId(Integer eId, Integer ltId);
}
