package fr.efrei.TancProjet;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface VehiculeRepository extends CrudRepository<Vehicule, Long>{
	List<Vehicule> findByName(String name);

}
