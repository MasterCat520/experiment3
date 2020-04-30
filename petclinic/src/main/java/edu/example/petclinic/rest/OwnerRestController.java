package edu.example.petclinic.rest;

import edu.example.petclinic.model.Owner;
import edu.example.petclinic.service.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/owners")
public class OwnerRestController {
    @Autowired
    ClinicService clinicService;

    	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Collection<Owner>> getAllVets(String lastName){
		Collection<Owner> owners = clinicService.getAllOwners();
		if(lastName==null)
            owners = clinicService.getAllOwners();
		else {
            owners = clinicService.findOwnerBylastName(lastName);
		}
		if (owners==null||owners.isEmpty()) {
			return new ResponseEntity<Collection<Owner>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<Owner>>(owners, HttpStatus.OK);
	}

    @RequestMapping(value = "", method = RequestMethod.POST, produces = "application/json")
    public void addOwner(Owner owner){
        clinicService.addOwner(owner);
//        return new ResponseEntity<Collection<Owner>>(owners, HttpStatus.OK);
    }
}
