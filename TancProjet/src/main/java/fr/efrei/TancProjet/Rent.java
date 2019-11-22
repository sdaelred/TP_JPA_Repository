package fr.efrei.TancProjet;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Rent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Date beginRent;
	private Date endRent;	
	
	@ManyToOne
	private Personn person;	
	public Personn getPerson() {
		return person;
	}

	public void setPerson(Personn person) {
		this.person = person;
	}

	public Vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	public void setId(Long id) {
		this.id = id;
	}
	@ManyToOne
	private Vehicule vehicule;
	
	public Rent() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	public Rent(Date beginRent, Date endRent, Long id) {
		super();
		this.beginRent = beginRent;
		this.endRent = endRent;
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public Rent(String begin_date, String end_date) {
		/*SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		setBeginRent(simpleDateFormat.parse(begin_date));
		setEndRent(simpleDateFormat.parse(end_date));*/
	}
	public Date getBeginRent() {
		return beginRent;
	}
	public void setBeginRent(Date beginRent) {
		this.beginRent = beginRent;
	}
	public Date getEndRent() {
		return endRent;
	}
	public void setEndRent(Date endRent) {
		this.endRent = endRent;
	}
	

}
