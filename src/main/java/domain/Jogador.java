package domain;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("J")
public class Jogador extends Profissional{
}
