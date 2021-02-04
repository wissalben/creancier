package web.service.ListCreancier.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import web.service.ListCreancier.entities.Categorie;





@Repository
public interface CategorieRepository extends JpaRepository<Categorie,Long> {
}
