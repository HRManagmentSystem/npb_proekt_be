package mk.ukim.finki.npb_proekt_be.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeEquipmentView;
import mk.ukim.finki.npb_proekt_be.repository.EmployeeEquipmentViewRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeEquipmentViewService {

    private final EmployeeEquipmentViewRepo employeeEquipmentViewRepo;


    public List<EmployeeEquipmentView> findFirstEmployeeEquipmentView(Integer n) {
        return this.employeeEquipmentViewRepo.findFirstEmployeeEquipmentView(n);
    }

    public List<EmployeeEquipmentView> findEmployeeEquipmentViewByEmployeeIdAndEquipmentId(Integer eId, Integer eqId) {
        return this.employeeEquipmentViewRepo.findEmployeeByIdAndEquipmentId(eId,eqId);
    }
}
