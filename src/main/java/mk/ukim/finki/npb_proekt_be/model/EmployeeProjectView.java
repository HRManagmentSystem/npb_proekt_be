package mk.ukim.finki.npb_proekt_be.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Immutable;

import java.util.Date;

@Entity
@Immutable
@Data
@Table(name = "employee_project_view")
public class EmployeeProjectView {
    @Id
    @Column(name = "project_hierarchy_id")
    private Integer projectHierarchyId;

    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "employee_last_name")
    private String employeeLastName;

    @Column(name = "projct_id")
    private Integer projectId;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "from_date")
    private Date fromDate;

    @Column(name = "due_date")
    private Date dueDate;

    @Column(name = "project_position_id")
    private Integer projectPositionId;

    @Column(name = "project_position_name")
    private String projectPositionName;

    @Column(name = "reports_to_project_hierarchy_id")
    private Integer reportsToProjectHierarchyId;

    @Column(name = "reports_to_employee_id")
    private Integer reportsToEmployeeId;

    @Column(name = "reports_to_employee_name")
    private String reportsToEmployeeName;

    @Column(name = "reports_to_employee_last_name")
    private String reportsToEmployeeLastName;

    @Column(name = "reports_to_project_position_id")
    private Integer reportsToProjectPositionId;

    @Column(name = "reports_to_project_position_name")
    private String reportsToProjectPositionName;
}