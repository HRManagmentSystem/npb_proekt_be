package mk.ukim.finki.npb_proekt_be.model;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Immutable;

import java.util.Date;

@Entity
@Immutable
@Data
@Table(name = "employee_employment_view")
public class EmployeeEmploymentView {
    @Id
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "current_employment_id")
    private Integer currentEmploymentId;

    @Column(name = "work_place_id")
    private Integer workPlaceId;

    @Column(name = "current_work_place_name")
    private String currentWorkPlaceName;

    @Column(name = "current_work_position_name")
    private String currentWorkPositionName;

    @Column(name = "curren_percentage_work_time")
    private Integer currentPercentageWorkTime;

    @Column(name = "current_department_name")
    private String currentDepartmentName;

    @Column(name = "current_department_type_name")
    private String currentDepartmentTypeName;

    @Column(name = "current_work_place_salary")
    private Integer currentWorkPlaceSalary;

    @Column(name = "current_work_place_full_time_salary")
    private Integer currentWorkPlaceFullTimeSalary;

    @Column(name = "current_effective_date")
    private Date currentEffectiveDate;

    @Column(name = "current_status")
    private String currentStatus;

    @Column(name = "previous_employment_id")
    private Integer previousEmploymentId;

    @Column(name = "previous_work_place_id")
    private Integer previousWorkPlaceId;

    @Column(name = "previous_work_place_name")
    private String previousWorkPlaceName;

    @Column(name = "previous_work_position_name")
    private String previousWorkPositionName;

    @Column(name = "previous_percentage_work_time")
    private Integer previousPercentageWorkTime;

    @Column(name = "previous_department_name")
    private String previousDepartmentName;

    @Column(name = "previous_department_type_name")
    private String previousDepartmentTypeName;

    @Column(name = "previous_work_place_salary")
    private Integer previousWorkPlaceSalary;

    @Column(name = "previous_work_place_full_time_salary")
    private Integer previousWorkPlaceFullTimeSalary;

    @Column(name = "previous_effective_date")
    private Date previousEffectiveDate;

    @Column(name = "previous_status")
    private String previousStatus;
}
