package mk.ukim.finki.npb_proekt_be.repository;

import mk.ukim.finki.npb_proekt_be.model.EmployeeLeaveInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeLeaveInformationRepo extends JpaRepository<EmployeeLeaveInformation, Integer> {

    @Query(value = "select * from employee_leave_information limit :n",nativeQuery = true)
    List<EmployeeLeaveInformation> findFirstEmployeeLeaveInformation(Integer n);

    @Query(value = "select * from employee_leave_information where employee_id = :id and leave_type_id = :ltId and free_days = :fd limit 50",nativeQuery = true)
    List<EmployeeLeaveInformation> filterEmployeeLeaveInformation(Integer id, Integer ltId, Integer fd);
}
