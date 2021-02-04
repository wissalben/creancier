package web.service.ListCreancier.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Entity
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToMany
    List<Creancier> creanciers;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Creancier> getCreanciers() {
		return creanciers;
	}

	public void setCreanciers(List<Creancier> creanciers) {
		this.creanciers = creanciers;
	}
    
    
}