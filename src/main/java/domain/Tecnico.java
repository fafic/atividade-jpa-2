package domain;

import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("T")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Tecnico extends Profissional {

    @OneToOne
    private Equipe equipe;

}
