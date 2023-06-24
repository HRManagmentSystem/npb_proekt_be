package mk.ukim.finki.npb_proekt_be.repository;

import mk.ukim.finki.npb_proekt_be.model.EmployeeAddressInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeAddressInformationRepo extends JpaRepository<EmployeeAddressInformation,Integer> {

    List<EmployeeAddressInformation> findAllByEmployeeIdAndPlaceId(Integer eId, Integer pId);

}
