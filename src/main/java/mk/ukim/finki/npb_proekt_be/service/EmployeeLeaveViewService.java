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

    public List<EmployeeLeaveView> findAllByEmployeeIdAndLeaveTypeId(Integer eId, Integer ltId){
        return this.employeeLeaveViewRepo.findAllByEmployeeIdAndLeaveTypeId(eId,ltId);
    }
}
