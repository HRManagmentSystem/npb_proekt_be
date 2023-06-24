package mk.ukim.finki.npb_proekt_be.repository;

import mk.ukim.finki.npb_proekt_be.model.EmployeeEquipmentView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeEquipmentViewRepo extends JpaRepository<EmployeeEquipmentView, Integer> {

    List<EmployeeEquipmentView> findAllByEmployeeIdAndEquipmentId(Integer eId, Integer eqId);

}
