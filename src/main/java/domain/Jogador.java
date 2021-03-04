package domain;


import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("J")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Jogador extends Profissional{

    private String posicao;
    private Boolean isTitular;

    @ManyToOne
    private Equipe equipe;
}
