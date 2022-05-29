package org.wswork.carro.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.wswork.carro.model.Modelo;

@Repository
public interface ModeloRepository extends JpaRepository<Modelo, Long>{
	public List<Modelo> findAllByModeloContainingIgnoreCase (String modelo);

}
