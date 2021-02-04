package web.service.ListCreancier.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import web.service.ListCreancier.entities.Creancier;



@Repository
public interface CreancierRepository extends JpaRepository<Creancier,Long> {
}
