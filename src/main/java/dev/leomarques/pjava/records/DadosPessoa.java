package dev.leomarques.pjava.records;

import dev.leomarques.pjava.entities.Pessoa;

public record DadosPessoa(String nome, String telefone, String email) {
	
	public DadosPessoa(Pessoa pessoa) {
		this(pessoa.getNome(), pessoa.getTelefone(), pessoa.getEmail());
	}

}
