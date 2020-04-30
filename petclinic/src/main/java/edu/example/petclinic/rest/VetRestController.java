package edu.example.petclinic.rest;

import edu.example.petclinic.model.Vet;
import edu.example.petclinic.service.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;

@RequestMapping("api/v1/vets")
@RestController
public class VetRestController {
	@Autowired
	private ClinicService clinicService;


	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Collection<Vet>> getAllVets(String lastName){
		Collection<Vet> vets = clinicService.getAllVets();
		if(lastName==null)
			vets = clinicService.getAllVets();
		else {
			vets = clinicService.findVetBylastName(lastName);
		}
		if (vets==null||vets.isEmpty()) {
			return new ResponseEntity<Collection<Vet>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<Vet>>(vets, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Vet> getVets(@PathVariable int id){
		Vet vet = clinicService.findVetById(id).orElse(null);
		if (vet==null) {
			return new ResponseEntity<Vet>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Vet>(vet,HttpStatus.OK);
	}
}
