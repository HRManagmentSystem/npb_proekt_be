package mk.ukim.finki.npb_proekt_be.repository;

import mk.ukim.finki.npb_proekt_be.model.DepartmentProjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentProjectsRepo extends JpaRepository<DepartmentProjects, Integer>{

    List<DepartmentProjects> findDepartmentProjectsByDepartmentIdAndProjectId(Integer id,Integer pId);
}
