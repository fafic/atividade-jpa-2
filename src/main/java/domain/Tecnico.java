package domain;

import lombok.*;

import javax.persistence.*;

@Entity
@DiscriminatorValue("T")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@NamedQueries({
        @NamedQuery(name = "equipeByTecnico", query = "select t from Tecnico t where t.nome=:nomeTecnico")
})
public class Tecnico extends Profissional {

    @OneToOne
    private Equipe equipe;

}
