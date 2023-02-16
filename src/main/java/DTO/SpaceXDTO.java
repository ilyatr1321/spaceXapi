package DTO;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class SpaceXDTO {
    private String capsule_serial;

    private String capsule_id;
}
