package org.nick.projetoIntegrador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_tema")
public class Tema {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "Não pode ser nulo e deve conter de 5 até 20 caracteres")
	@Size(min = 5, max = 20)
	private String titulo;
	
	@NotNull(message = "Não pode ser nulo e deve conter no maximo 10 caracteres")
	@Size(min = 1, max = 10, message = "Livre/Adulto")
	private String classificacao;
	
	@NotNull(message = "Não pode ser nulo e deve conter de 5 até 30 caracteres")
	@Size(min = 5, max = 30, message = "Leve/Moderado/Grave")
	private String impacto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getImpacto() {
		return impacto;
	}

	public void setImpacto(String impacto) {
		this.impacto = impacto;
	}
	
	
	
}
