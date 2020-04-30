package edu.example.petclinic.repository;

import java.util.Collection;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import edu.example.petclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner,Integer> {
    @Query("SELECT * FROM OWNERS WHERE LAST_NAME LIKE :lastName")
    public Collection<Owner> findByLastName(@Param("lastName") String lastName);
    
}
