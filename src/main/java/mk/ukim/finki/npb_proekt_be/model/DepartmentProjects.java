package mk.ukim.finki.npb_proekt_be.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

@Entity
@Immutable
@Data
@Table(name="department_projects")
public class DepartmentProjects {

    @Id
    @Column(name="department_id")
    private Integer departmentId;

    @Column(name="departmentname")
    private String departmentName;

    @Column(name="departmenttype_id")
    private Integer departmentTypeId;

    @Column(name="departmenttype")
    private String departmentType;

    @Column(name="project_id")
    private Integer projectId;

    @Column(name="projectname")
    private String projectName;

    @Column(name="projectcategory")
    private String projectCategory;

    @Column(name="hierarchy_id")
    private Integer hierarchyId;

    @Column(name="phase_id")
    private Integer phaseId;

    @Column(name="phase")
    private String phase;

}
