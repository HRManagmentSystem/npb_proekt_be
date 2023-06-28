package mk.ukim.finki.npb_proekt_be.repository;

import mk.ukim.finki.npb_proekt_be.model.EmployeeEmploymentView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeEmploymentViewRepo extends JpaRepository<EmployeeEmploymentView, Integer> {

    @Query(value = "select * from employee_employment_view limit :n",nativeQuery = true)
    List<EmployeeEmploymentView> findFirstEmployeeEmploymentView(Integer n);

    @Query(value = "select * from employee_employment_view where employee_id = :id",nativeQuery = true)
    List<EmployeeEmploymentView> findEmployeesById(Integer id);
}
