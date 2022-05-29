package org.wswork.carro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wswork.carro.model.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long>{
	public List<Marca> findAllByNomeContainingIgnoreCase(String nome);

}
