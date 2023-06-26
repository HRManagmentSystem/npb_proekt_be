package mk.ukim.finki.npb_proekt_be.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Immutable;

import java.util.Date;
@Entity
@Immutable
@Data
@Table(name = "employee_peer_feedback_view")
public class EmployeePeerFeedback {
    @Id
    @Column(name = "peer_feedack_id")
    private Integer peerFeedbackId;

    @Column(name = "peer_feedback_created_date")
    private Date peerFeedbackCreatedDate;

    @Column(name = "peer_feedback_status")
    private String peerFeedbackStatus;

    @Column(name = "evaluation_for_employee_id")
    private Integer evaluationForEmployeeId;

    @Column(name = "evaluation_for_employee_first_name")
    private String evaluationForEmployeeFirstName;

    @Column(name = "evaluation_for_employee_last_name")
    private String evaluationForEmployeeLastName;

    @Column(name = "evaluation_for_employee_ssn")
    private String evaluationForEmployeeSsn;

    @Column(name = "peer_feedback_question_id")
    private Integer peerFeedbackQuestionId;

    @Column(name = "question_id")
    private Integer questionId;

    @Column(name = "question_title")
    private String questionTitle;

    @Column(name = "question_body")
    private String questionBody;

    @Column(name = "answer_id")
    private Integer answerId;

    @Column(name = "answer_body")
    private String answerBody;

    @Column(name = "answer_rating")
    private Integer answerRating;

    @Column(name = "answer_status")
    private String answerStatus;

    @Column(name = "answer_date")
    private Date answerDate;

    @Column(name = "answered_from_employee_id")
    private Integer answeredFromEmployeeId;

    @Column(name = "answered_from_employee_first_name")
    private String answeredFromEmployeeFirstName;

    @Column(name = "answered_from_employee_last_name")
    private String answeredFromEmployeeLastName;

    @Column(name = "answered_from_employee_ssn")
    private String answeredFromEmployeeSsn;
}
