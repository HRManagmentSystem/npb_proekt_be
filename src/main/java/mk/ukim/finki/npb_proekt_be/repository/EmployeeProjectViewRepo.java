package mk.ukim.finki.npb_proekt_be.repository;

import mk.ukim.finki.npb_proekt_be.model.EmployeeProjectView;
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
public interface EmployeeProjectViewRepo extends JpaRepository<EmployeeProjectView, Integer> {

    @Query(value = "select * from employee_project_view where project_hierarchy_id is not null limit :n", nativeQuery = true)
    List<EmployeeProjectView> findFirstEmployeeProjectView(Integer n);

    @Query(value = "select * from employee_project_view where project_hierarchy_id is not null and employee_id=:eId and projct_id=:pId and department_id=:dId limit 50", nativeQuery = true)
    List<EmployeeProjectView> findAllByEmployeeIdAndProjectIdAndDepartmentId(Integer eId,Integer pId,Integer dId);

    @Modifying
    @Query(value = "call insert_employee_project_position(:employee,:project,:project_position,:reports_to_project_hierarchy,:from_date_project,:if_exists_update)",nativeQuery = true)
    void insertEmployeeProjectPosition(
            @Param("employee") Integer employee,
            @Param("project") Integer project,
            @Param("project_position") Integer project_position,
            @Param("reports_to_project_hierarchy") Integer reports_to_project_hierarchy,
            @Param("from_date_project") Date from_date_project,
            @Param("if_exists_update") Boolean if_exists_update
    );
    // employee - 40:... , project - 25.. , project-postion - 1:74, reports - 411732 ,
}
