package mk.ukim.finki.npb_proekt_be.model;


import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Data
@Table(name = "employee_feedbacks")
public class EmployeeFeedbacks {

    @Id
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "ssn")
    private String ssn;

    @Column(name = "peerfeedback_id")
    private Integer peerFeedbackId;

    @Column(name = "peerfeedbackquestion_id")
    private Integer peerFeedbackQuestionId;

    @Column(name = "question_body")
    private String questionBody;

    @Column(name = "question_title")
    private String questionTitle;

    @Column(name = "peerfeedbackquestionanswer")
    private Integer peerFeedbackQuestionAnswer;

    @Column(name = "answer_body")
    private String answerBody;
}