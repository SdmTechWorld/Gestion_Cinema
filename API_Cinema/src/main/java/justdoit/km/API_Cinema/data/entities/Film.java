package justdoit.km.API_Cinema.data.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Film implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String description;
    private String realisateur;
    private String photo;
    private Date dateSortie;
    private double duree;
    @OneToMany(mappedBy = "film")
    private Collection<ProjectionFilm> projectionFilms;
    @ManyToOne
    private Category category;

}
