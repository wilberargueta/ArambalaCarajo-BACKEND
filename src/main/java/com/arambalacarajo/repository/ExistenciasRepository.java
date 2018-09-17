package com.arambalacarajo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Existencias;
import com.arambalacarajo.entity.Productos;

@Repository("existenciasRepository")
public interface ExistenciasRepository extends JpaRepository<Existencias, Integer> {
	
	public Existencias findExistenciaByIdExistencias(int idExistencias);
	public Existencias findExistenciasByProductos(Productos productos);

}
