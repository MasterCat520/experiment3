package edu.example.petclinic.repository;

import edu.example.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetsRespository extends CrudRepository<Pet,Integer> {
}
