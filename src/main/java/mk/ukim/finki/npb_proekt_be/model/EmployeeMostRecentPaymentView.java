package mk.ukim.finki.npb_proekt_be.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Immutable;

import java.util.Date;

@Entity
@Immutable
@Data
@Table(name = "employee_most_recent_payment_view")
public class EmployeeMostRecentPaymentView {

    @Id
    @Column(name = "payment_id")
    private Integer paymentId;

    @Column(name = "total_salary")
    private Integer totalSalary;

    @Column(name = "comment")
    private String comment;

    @Column(name = "most_resent_payment_change_date")
    private Date mostResentPaymentChangeDate;

    @Column(name = "bonus")
    private Integer bonus;

    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "payment_type_id")
    private Integer paymentTypeId;

    @Column(name = "name")
    private String name;

    @Column(name = "payment_type_amount")
    private Integer paymentTypeAmount;

    @Column(name = "payment_change_reason_id")
    private Integer paymentChangeReasonId;

    @Column(name = "reason")
    private String reason;
}