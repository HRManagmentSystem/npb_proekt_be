package mk.ukim.finki.npb_proekt_be.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Data
@Table(name="employee_address_information")
public class EmployeeAddressInformation {

    @Id
    @Column(name="employee_id")
    private Integer employeeId;

    @Column(name="employee_fullname")
    private String employeeFullName;

    @Column(name="employee_ssn")
    private String employeeSsn;

    @Column(name = "worklocation_id")
    private Integer workLocationId;

    @Column(name = "worklocationaddress")
    private String workLocationAddress;

    @Column(name="placeid")
    private Integer placeId;

    @Column(name="placename")
    private String placeName;

}
