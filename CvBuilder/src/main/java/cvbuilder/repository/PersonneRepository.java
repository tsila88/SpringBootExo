package cvbuilder.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cvbuilder.entities.Personne;

@Repository
public interface PersonneRepository extends CrudRepository<Personne, Long> {

}
