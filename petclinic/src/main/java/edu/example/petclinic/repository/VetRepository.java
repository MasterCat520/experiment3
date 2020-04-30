package edu.example.petclinic.repository;

import edu.example.petclinic.model.Vet;

import java.util.Collection;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepository extends CrudRepository<Vet,Integer> {
	@Query("SELECT * FROM VETS WHERE LAST_NAME LIKE :lastName")
	public Collection<Vet> findByLastName(@Param("lastName") String lastName);
}
