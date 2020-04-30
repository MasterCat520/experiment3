package edu.example.petclinic.service;

import edu.example.petclinic.model.Owner;
import edu.example.petclinic.model.Vet;

import java.util.Collection;
import java.util.Optional;

public interface ClinicService {

    public Collection<Vet> getAllVets();
    public Optional<Vet> findVetById(int id);
    public Collection<Vet> findVetBylastName(String lastName);
    public void addOwner(Owner owner);
    public Collection<Owner> getAllOwners();
    public Collection<Owner> findOwnerBylastName(String lastName);
}
