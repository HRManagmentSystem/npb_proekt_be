package mk.ukim.finki.npb_proekt_be.service;

import lombok.AllArgsConstructor;
import mk.ukim.finki.npb_proekt_be.model.EmployeeAddressInformation;
import mk.ukim.finki.npb_proekt_be.repository.EmployeeAddressInformationRepo;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeAddressInformationService {

    private final EmployeeAddressInformationRepo employeeAddressInformationRepo;

    public List<EmployeeAddressInformation> findFirstEmployeeAddressInformation(Integer n) {
        return this.employeeAddressInformationRepo.findFirstEmployeeAddressInformation(n);
    }

    public List<EmployeeAddressInformation> findEmployeeAddressInformationByEmployeeIdAndPlaceId(Integer eId, Integer pId) {
        return this.employeeAddressInformationRepo.findAllByEmployeeIdAndPlaceId(eId,pId);
    }

    public void changeEmployeeStatus(Integer employee,String employee_status,Date effective_date){
        this.employeeAddressInformationRepo.changeEmployeeStatus(employee, employee_status, effective_date);
    }
}
