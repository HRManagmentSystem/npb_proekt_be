package mk.ukim.finki.npb_proekt_be.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Immutable;

import java.util.Date;

@Entity
@Immutable
@Data
@Table(name="employee_equipment_view")
public class EmployeeEquipmentView {

    @Id
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name="equipment_id")
    private Integer equipmentId;

    @Column(name="first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "ssn")
    private String ssn;

    @Column(name = "phone")
    private String phone;

    @Column(name = "equipment_name")
    private String equipmentName;

    @Column(name = "equipment_type")
    private String equipmentType;

    @Column(name = "date_taken")
    private Date dateTaken;

    @Column(name="date_returned")
    private Date dateReturned;

    @Column(name = "quantity_taken")
    private Integer quantityTaken;
}
