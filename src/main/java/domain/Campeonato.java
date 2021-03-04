package domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
public class Campeonato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "campeonatos")
    private List<Equipe> equipes;

    @Temporal(TemporalType.DATE)
    private Calendar dataInicio;

    @Temporal(TemporalType.DATE)
    private Calendar dataFim;
}
