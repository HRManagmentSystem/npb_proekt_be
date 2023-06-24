package mk.ukim.finki.npb_proekt_be.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Data
@Table(name = "news_in_company")
public class NewsInCompany {

    @Id
    @Column(name = "news_id")
    private Integer newsId;

    @Column(name = "news_title")
    private String newsTitle;

    @Column(name = "news_description")
    private String newsDescription;

    @Column(name = "publisher_id")
    private Integer publisherId;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "newscategory_id")
    private Integer newsCategoryId;

    @Column(name = "newscategory_description")
    private String newsCategoryDescription;

    @Column(name = "employeegroup_id")
    private Integer employeeGroupId;

    @Column(name = "employeegroup_description")
    private String employeeGroupDescription;
}