package fr.efrei.TancProjet;
import org.springframework.beans.factory.annotation.Autowired;
import fr.efrei.TancProjet.Personn;
import fr.efrei.TancProjet.PersonnRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonnRestWebService {

	PersonnRepository personnRepository;
	
	@Autowired
	public PersonnRestWebService(PersonnRepository personnRepository) {
		super();
		this.personnRepository = personnRepository;
	}
	
	@GetMapping("/personns")
	public Iterable<Personn> getPersonns(){
		return personnRepository.findAll();
	}
}