package mk.ukim.finki.npb_proekt_be.repository;

import mk.ukim.finki.npb_proekt_be.model.EmployeeProjectView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeProjectViewRepo extends JpaRepository<EmployeeProjectView, Integer> {

    @Query(value = "select * from employee_project_view limit :n", nativeQuery = true)
    List<EmployeeProjectView> findFirstEmployeeProjectView(Integer n);

    List<EmployeeProjectView> findAllByEmployeeIdAndProjectId(Integer eId,Integer pId);

}
