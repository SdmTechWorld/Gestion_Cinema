package justdoit.km.API_Cinema.data.Repositories;

import justdoit.km.API_Cinema.data.entities.ProjectionFilm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProjectionFilmRepository extends JpaRepository<ProjectionFilm,Long> {
}
