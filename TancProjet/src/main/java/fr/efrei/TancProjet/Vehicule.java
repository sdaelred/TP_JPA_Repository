package fr.efrei.TancProjet;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Vehicule {
public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private int plateNumber;

@OneToMany(mappedBy="vehicule", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
private List<Vehicule> vehicules = new ArrayList<Vehicule>();

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public int getPlateNumber() {
	return plateNumber;
}

public void setPlateNumber(int plateNumber) {
	this.plateNumber = plateNumber;
}

public List<Vehicule> getVehicule() {
	return vehicules;
}

}
