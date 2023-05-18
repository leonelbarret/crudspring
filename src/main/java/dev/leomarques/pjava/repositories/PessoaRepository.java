package dev.leomarques.pjava.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import dev.leomarques.pjava.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

	//Page<Pessoa> findAllPersonalizado(Pageable paginacao);

}
