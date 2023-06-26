package mk.ukim.finki.npb_proekt_be.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Data
@Table(name = "employee_in_onboarding_offboarding_phase")
public class EmployeeOnboardingOffboardingPhase {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "ssn")
    private String ssn;

    @Column(name = "onboarding_offboarding_program_id")
    private Integer onboardingOffboardingProgramId;

    @Column(name = "program_description")
    private String programDescription;

    @Column(name = "program_information")
    private String programInformation;

    @Column(name = "program_type")
    private String programType;

    @Column(name = "phase_id")
    private Integer phaseId;

    @Column(name = "phase_name")
    private String phaseName;

    @Column(name = "phase_type_id")
    private Integer phaseTypeId;

    @Column(name = "phase_type_name")
    private String phaseTypeName;
}