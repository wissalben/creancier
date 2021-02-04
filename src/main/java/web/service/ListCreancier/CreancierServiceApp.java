package web.service.ListCreancier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import web.service.ListCreancier.entities.Categorie;
import web.service.ListCreancier.entities.Creancier;
import web.service.ListCreancier.repositories.CategorieRepository;
import web.service.ListCreancier.repositories.CreancierRepository;

import javax.persistence.Entity;



@SpringBootApplication
public class CreancierServiceApp implements CommandLineRunner {


	@Autowired
	CreancierRepository creancierRepository;

	@Autowired
	CategorieRepository categorieRepository;


	public static void main(String[] args) {
		SpringApplication.run(CreancierServiceApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		Categorie categorie1 = new Categorie();
		Categorie categorie2 = new Categorie();
		Categorie categorie3 = new Categorie();
		

		Creancier creancier1 = new Creancier();
		Creancier creancier2 = new Creancier();
		Creancier creancier3 = new Creancier();
		Creancier creancier4 = new Creancier();
		Creancier creancier5 = new Creancier();
		Creancier creancier6 = new Creancier();

		categorie1.setName("opérateurs de télécommunications");
		categorie2.setName("opérateur d'eau potable et d'assainissement");
		categorie3.setName(" opérateur de services publics");
		

		creancier1.setCode("1998");
		creancier1.setName("maroc telecom");
		creancier1.setCategorie(categorie1);

		creancier2.setCode("1999");
		creancier2.setName("orange");
		creancier2.setCategorie(categorie1);

		creancier3.setCode("2000");
		creancier3.setName("inwi");
		creancier3.setCategorie(categorie1);

		creancier4.setCode("RD");
		creancier4.setName("Redal");
		creancier4.setCategorie(categorie2);

		
		creancier5.setCode("RDM");
		creancier5.setName("Radeema");
		creancier5.setCategorie(categorie2);

		creancier6.setCode("AMD");
		creancier6.setName("Amendis");
		creancier6.setCategorie(categorie3);

		categorieRepository.save(categorie1);
		categorieRepository.save(categorie2);
		categorieRepository.save(categorie3);
		
		creancierRepository.save(creancier1);
		creancierRepository.save(creancier2);
		creancierRepository.save(creancier3);
		creancierRepository.save(creancier4);
		creancierRepository.save(creancier5);
		creancierRepository.save(creancier6);





	}
}
