package mk.ukim.finki.npb_proekt_be.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Data
@Table(name = "employee_in_onboarding_phase")
public class EmployeeInOnboardingPhase {

    @Id
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "employee_fullname")
    private String employeeFullName;

    @Column(name = "employee_ssn")
    private String employeeSSN;

    @Column(name = "program_id")
    private Integer programId;

    @Column(name = "programinformation")
    private String programInformation;

    @Column(name = "programtype")
    private String programType;

    @Column(name = "programphase_id")
    private Integer programPhaseId;

    @Column(name = "programphasename")
    private String programPhaseName;
}