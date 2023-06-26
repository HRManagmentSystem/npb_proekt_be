package mk.ukim.finki.npb_proekt_be.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Immutable;

import java.util.Date;

@Entity
@Immutable
@Data
@Table(name = "employee_leave_information")
public class EmployeeLeaveInformation {
    @Id
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "leave_information_id")
    private Integer leaveInformationId;

    @Column(name = "leave_type_id")
    private Integer leaveTypeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "ssn")
    private String ssn;

    @Column(name = "free_days")
    private Integer freeDays;

    @Column(name = "leave_type_name")
    private String leaveTypeName;

    @Column(name = "date_valid_to")
    private Date dateValidTo;
}
