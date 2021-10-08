package org.nick.projetoIntegrador.repository;

import java.util.List;

import org.nick.projetoIntegrador.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
}
