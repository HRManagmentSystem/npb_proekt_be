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

    @Column(name = "employee_publish_id")
    private Integer employeePublishId;

    @Column(name = "employee_publish_full_name")
    private String employeePublishFullNameName;

    @Column(name = "news_category_id")
    private Integer newsCategoryId;

    @Column(name = "news_category_name")
    private String newCategoryName;

    @Column(name = "news_category_description")
    private String newsCategoryDescription;

    @Column(name = "employee_group_id")
    private Integer employeeGroupId;

    @Column(name = "employee_group_name")
    private String employeeGroupName;

    @Column(name = "employee_group_description")
    private String employeeGroupDescription;
}