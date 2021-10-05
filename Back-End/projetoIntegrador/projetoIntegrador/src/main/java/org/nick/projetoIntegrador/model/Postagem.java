package org.nick.projetoIntegrador.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_postagem")
public class Postagem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "Não pode ser nulo e deve conter no maximo 10 caracteres")
	@Size(min = 1, max = 10, message = "Privado/Publico")
	private String privacidade;
	
	@NotNull(message = "Não pode ser nulo e deve conter no maximo 150 caracteres")
	@Size(min = 1, max = 150, message = "Escreva resumidamente o conteudo da sua postagem")
	private String resumo;
	
	@NotNull(message = "Não pode ser nulo e deve conter no maximo 1500 caracteres")
	@Size(min = 1, max = 1500, message = "Escreva o conteudo da sua postagem")
	private String texto;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date horario = new java.sql.Date(System.currentTimeMillis());
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String isPrivacidade() {
		return privacidade;
	}
	public void setPrivacidade(String privacidade) {
		this.privacidade = privacidade;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Date getHorario() {
		return horario;
	}
	public void setHorario(Date horario) {
		this.horario = horario;
	}
	
}
