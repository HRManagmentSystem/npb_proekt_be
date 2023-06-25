package mk.ukim.finki.npb_proekt_be.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeLeaveView;
import mk.ukim.finki.npb_proekt_be.repository.EmployeeLeaveViewRepo;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeLeaveViewService {

    private final EmployeeLeaveViewRepo employeeLeaveViewRepo;

    public List<EmployeeLeaveView> findFirstEmployeeLeaveView(Integer n) {
        return this.employeeLeaveViewRepo.findFirstEmployeeLeaveView(n);
    }

    public List<EmployeeLeaveView> findAllByEmployeeIdAndLeaveTypeId(Integer eId, Integer ltId){
        return this.employeeLeaveViewRepo.findAllByEmployeeIdAndLeaveTypeId(eId,ltId);
    }

    public void insertEmployeeLeave(Integer employee,Integer leave_type,Integer reason_for_leave,Date start_date,Date end_date) {
        this.employeeLeaveViewRepo.insertEmployeeLeave(employee, leave_type, reason_for_leave, start_date, end_date);
    }
}
