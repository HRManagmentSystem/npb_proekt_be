package mk.ukim.finki.npb_proekt_be.repository;

import mk.ukim.finki.npb_proekt_be.model.EmployeeAddressInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeAddressInformationRepo extends JpaRepository<EmployeeAddressInformation,Integer> {

    @Query(value = "select * from employee_address_information limit :n",nativeQuery = true)
    List<EmployeeAddressInformation> findFirstEmployeeAddressInformation(Integer n);

    List<EmployeeAddressInformation> findAllByEmployeeIdAndPlaceId(Integer eId, Integer pId);

}
