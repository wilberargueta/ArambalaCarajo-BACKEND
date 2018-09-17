package com.arambalacarajo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.Cabanas;

@Repository("cabañasRepository")
public interface CabañasRepository extends JpaRepository<Cabanas, Character> {

	public Cabanas findCabañaByCodCabana(char[] codCabana);

}
