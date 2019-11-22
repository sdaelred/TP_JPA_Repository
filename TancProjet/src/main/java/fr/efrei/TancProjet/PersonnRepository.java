package fr.efrei.TancProjet;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface PersonnRepository extends CrudRepository<Personn, Long>{
	List<Personn> findByName(String name);

}
