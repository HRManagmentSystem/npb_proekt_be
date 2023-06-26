package mk.ukim.finki.npb_proekt_be.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import java.util.Date;

@Entity
@Immutable
@Data
@Table(name = "department_projects")
public class DepartmentProjects {
    @Id
    @Column(name = "department_id")
    private Integer departmentId;

    @Column(name = "departmentname")
    private String departmentName;

    @Column(name = "departmenttype_id")
    private Integer departmentTypeId;

    @Column(name = "departmenttype")
    private String departmentType;

    @Column(name = "project_id")
    private Integer projectId;

    @Column(name = "projectname")
    private String projectName;

    @Column(name = "projectcategory")
    private String projectCategory;

    @Column(name = "phase_id")
    private Integer phaseId;

    @Column(name = "phase")
    private String phase;

    @Column(name = "phase_date_from")
    private Date phaseDateFrom;

    @Column(name = "phase_date_to")
    private Date phaseDateTo;

    @Column(name = "hierarchy_id")
    private Integer hierarchyId;

    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "employee_ssn")
    private String employeeSsn;

    @Column(name = "project_position_id")
    private Integer projectPositionId;

    @Column(name = "project_position_name")
    private String projectPositionName;
}