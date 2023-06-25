package mk.ukim.finki.npb_proekt_be.repository;

import mk.ukim.finki.npb_proekt_be.model.EmployeeAddressInformation;
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
public interface EmployeeAddressInformationRepo extends JpaRepository<EmployeeAddressInformation, Integer> {

    @Query(value = "select * from employee_address_information limit :n", nativeQuery = true)
    List<EmployeeAddressInformation> findFirstEmployeeAddressInformation(Integer n);

    List<EmployeeAddressInformation> findAllByEmployeeIdAndPlaceId(Integer eId, Integer pId);

    @Modifying
    @Query(value = "call change_employee_status(:employee,:employee_status,:effective_date)", nativeQuery = true)
    void changeEmployeeStatus(@Param("employee") Integer employee, @Param("employee_status") String employee_status, @Param("effective_date") Date effective_date);

}
