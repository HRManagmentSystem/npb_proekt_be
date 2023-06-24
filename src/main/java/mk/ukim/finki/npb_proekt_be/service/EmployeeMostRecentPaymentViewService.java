package mk.ukim.finki.npb_proekt_be.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeMostRecentPaymentView;
import mk.ukim.finki.npb_proekt_be.repository.EmployeeMostRecentPaymentViewRepo;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeMostRecentPaymentViewService {

    private final EmployeeMostRecentPaymentViewRepo employeeMostRecentPaymentViewRepo;

    public List<EmployeeMostRecentPaymentView> findFirstEmployeeMostRecentPaymentView(Integer n) {
        return this.employeeMostRecentPaymentViewRepo.findFirstEmployeeMostRecentPaymentView(n);
    }

    public List<EmployeeMostRecentPaymentView> findAllByEmployeeIdAndPaymentId(Integer eId, Integer pId) {
        return this.employeeMostRecentPaymentViewRepo.findAllByEmployeeIdAndPaymentId(eId, pId);
    }

    public void generatePaySlip(Integer employeeId, Integer month, Integer year, Integer bonus) {
        this.employeeMostRecentPaymentViewRepo.generatePaySlip(employeeId, month, year, bonus);
    }

}
