package justdoit.km.API_Cinema.data.Repositories;

import justdoit.km.API_Cinema.data.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FilmRepository extends JpaRepository<Film,Long> {
}
