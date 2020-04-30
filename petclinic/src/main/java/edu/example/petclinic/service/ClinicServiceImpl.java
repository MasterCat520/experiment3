package edu.example.petclinic.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.example.petclinic.model.Owner;
import edu.example.petclinic.model.Vet;
import edu.example.petclinic.repository.OwnerRepository;
import edu.example.petclinic.repository.VetRepository;

@Service
public class ClinicServiceImpl implements ClinicService{

    @Autowired
    private VetRepository vetRepo;
    @Autowired
    private OwnerRepository ownerRepo;

    @Autowired
    public ClinicServiceImpl(
            VetRepository vetRepo,OwnerRepository ownerRepo
    ){
        this.ownerRepo = ownerRepo;
        this.vetRepo = vetRepo;
    }

    @Override
    public Collection<Vet> getAllVets() {
        Collection<Vet> vets = new ArrayList<Vet>();
        vetRepo.findAll().forEach(vet -> {
            vets.add(vet);
        });
        return vets;
    }

    @Override
    public Optional<Vet> findVetById(int id) {
        return vetRepo.findById(id);
    }

    @Override
    public Collection<Vet> findVetBylastName(String lastName) {
        // TODO Auto-generated method stub
        return vetRepo.findByLastName("%"+lastName+"%");
    }

    @Override
    public void addOwner(Owner owner) {//添加owner
        ownerRepo.save(owner);
    }

    @Override
    public Collection<Owner> getAllOwners() {//获取所有的Owners
        return (Collection<Owner>)ownerRepo.findAll();
    }

    @Override
    public Collection<Owner> findOwnerBylastName(String lastName) {//根据lastname查找owners
        return ownerRepo.findByLastName("%"+lastName+"%");
    }


}
