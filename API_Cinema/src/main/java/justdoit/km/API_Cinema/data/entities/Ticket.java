package justdoit.km.API_Cinema.data.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Ticket {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomClient;
    private double prix;
    @Column(unique = true)
    private int codePaiement;
    private boolean reservee;
    @ManyToOne
    private Place place;
    @ManyToOne
    private ProjectionFilm projectionFilm;
}
