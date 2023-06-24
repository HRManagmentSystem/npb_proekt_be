package mk.ukim.finki.npb_proekt_be.repository;

import mk.ukim.finki.npb_proekt_be.model.EmployeeProjectView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeProjectViewRepo extends JpaRepository<EmployeeProjectView, Integer> {

    List<EmployeeProjectView> findAllByEmployeeIdAndProjectId(Integer eId,Integer pId);

}
