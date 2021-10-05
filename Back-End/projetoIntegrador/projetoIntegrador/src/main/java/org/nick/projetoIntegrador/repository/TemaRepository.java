package org.nick.projetoIntegrador.repository;

import java.util.List;


import org.nick.projetoIntegrador.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long>{
	public List<Tema> findAllByTituloContainingIgnoreCase(String texto);
	

}
