package mk.ukim.finki.npb_proekt_be.repository;

import mk.ukim.finki.npb_proekt_be.model.EmployeeEquipmentView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeEquipmentViewRepo extends JpaRepository<EmployeeEquipmentView, Integer> {

    @Query(value = "select * from employee_equipment_view limit :n",nativeQuery = true)
    List<EmployeeEquipmentView> findFirstEmployeeEquipmentView(Integer n);

    @Query(value = "select * from employee_equipment_view where employee_id = :id and equipment_id = :eqId limit 50",nativeQuery = true)
    List<EmployeeEquipmentView> findEmployeeByIdAndEquipmentId(Integer id, Integer eqId);
}
