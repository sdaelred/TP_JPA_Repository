package fr.efrei.TancProjet;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface VanRepository extends CrudRepository<Van, Long>{
	List<Van> findByName(String name);

}
