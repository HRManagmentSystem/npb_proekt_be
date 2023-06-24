package mk.ukim.finki.npb_proekt_be.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Immutable;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Immutable
@Data
@Table(name = "employee_leave_view")
public class EmployeeLeaveView {
    @Id
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "leave_type_id")
    private Integer leaveTypeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "ssn")
    private String ssn;

    @Column(name = "days_taken")
    private Integer daysTaken;

    @Column(name = "date_from")
    private Date dateFrom;

    @Column(name = "date_to")
    private Date dateTo;

    @Column(name = "leave_type_name")
    private String leaveTypeName;

    @Column(name = "reason")
    private String reason;
}