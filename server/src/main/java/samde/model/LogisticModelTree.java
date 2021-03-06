package samde.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "logistic_model_tree")
public class LogisticModelTree {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "version", nullable = false)
    private String version;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_on", nullable = false)
    private Date createdOn;

    @Lob
    @Column(name = "model", nullable = false)
    private byte[] model;

    public LogisticModelTree() {
    }

    public LogisticModelTree(String version, byte[] model) {
        this.version = version;
        this.model = model;
        this.createdOn = new Date();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public byte[] getModel() {
        return model;
    }

    public void setModel(byte[] model) {
        this.model = model;
    }
}
