package Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SpaceXCapsules {

    private String capsule_serial;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String capsule_id;

    private String status;

    private Date original_launch;

    private String type;

    private String details;

    public String getCapsule_serial() {
        return capsule_serial;
    }

    public void setCapsule_serial(String capsule_serial) {
        this.capsule_serial = capsule_serial;
    }

    public String getCapsule_id() {
        return capsule_id;
    }

    public void setCapsule_id(String capsule_id) {
        this.capsule_id = capsule_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getOriginal_launch() {
        return original_launch;
    }

    public void setOriginal_launch(Date original_launch) {
        this.original_launch = original_launch;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }


}
