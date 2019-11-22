package fr.efrei.TancProjet;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface RentRepository extends CrudRepository<Rent, Long>{
	List<Rent> findByName(String name);

}
