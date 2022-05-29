package org.wswork.carro.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "marca")
public class Marca {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NonNull
	private  String nome;
	
	
	@OneToMany(mappedBy = "marca", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("marca")
	private List<Modelo> modelo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome_marca() {
		return nome;
	}

	public void setNome_marca(String nome_marca) {
		this.nome = nome_marca;
	}

	public List<Modelo> getModelo() {
		return modelo;
	}

	public void setModelo(List<Modelo> modelo) {
		this.modelo = modelo;
	}
	
	

}