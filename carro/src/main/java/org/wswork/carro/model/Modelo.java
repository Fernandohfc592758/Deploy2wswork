package org.wswork.carro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "modelo")


public class Modelo {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id; 
	
	@NonNull
	private String modelo;
	
	private int ano;
	
	private boolean combustivel;
	
	@NonNull
	private int numportas;
	
	@NonNull
	private String cor;
	
	private float valorfipe;
	
	@NonNull
	private float timestamp_cadastro;
	
	
	@ManyToOne
	@JsonIgnoreProperties("modelo")
	private Marca marca;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isCombustivel() {
		return combustivel;
	}

	public void setCombustivel(boolean combustivel) {
		this.combustivel = combustivel;
	}

	public int getNumportas() {
		return numportas;
	}

	public void setNumportas(int numportas) {
		this.numportas = numportas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getValorfipe() {
		return valorfipe;
	}

	public void setValorfipe(float valorfipe) {
		this.valorfipe = valorfipe;
	}

	public float getTimestamp_cadastro() {
		return timestamp_cadastro;
	}

	public void setTimestamp_cadastro(float timestamp_cadastro) {
		this.timestamp_cadastro = timestamp_cadastro;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	
	
	

}
