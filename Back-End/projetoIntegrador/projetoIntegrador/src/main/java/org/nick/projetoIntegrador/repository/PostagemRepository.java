package org.nick.projetoIntegrador.repository;

import java.util.List;

import org.nick.projetoIntegrador.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;

	public interface PostagemRepository extends JpaRepository<Postagem, Long>{
		public List<Postagem> findAllByTextoContainingIgnoreCase(String texto);
}