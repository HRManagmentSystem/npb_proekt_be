package mk.ukim.finki.npb_proekt_be.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Data
@Table(name = "job_ads")
public class JobAds {
    @Id
    @Column(name = "jobad_id")
    private Integer jobAdId;

    @Column(name = "jobdescription")
    private String jobDescription;

    @Column(name = "worklocationid")
    private Integer workLocationId;

    @Column(name = "worklocation")
    private String workLocation;

    @Column(name = "placeid")
    private Integer placeId;

    @Column(name = "placename")
    private String placeName;
}
