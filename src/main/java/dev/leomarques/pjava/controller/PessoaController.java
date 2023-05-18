package dev.leomarques.pjava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dev.leomarques.pjava.entities.Pessoa;
import dev.leomarques.pjava.records.DadosCadastroPessoa;
import dev.leomarques.pjava.records.DadosPessoa;
import dev.leomarques.pjava.repositories.PessoaRepository;

@Controller
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaRepository repo;
	
	@GetMapping
	public Page<DadosPessoa> listar(@PageableDefault(size = 5, sort = {"nome"}) Pageable paginacao){
		return repo.findAll(paginacao).map(DadosPessoa::new);
	}
	
	@PostMapping
	@Transactional
	public void Cadastro(DadosCadastroPessoa dado) {
		repo.save(new Pessoa(dado));
	}

}
