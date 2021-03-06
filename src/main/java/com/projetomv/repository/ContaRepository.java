package com.projetomv.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetomv.model.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {
	
	public List<Conta> findAllByNumConta(long numConta);
	

}
