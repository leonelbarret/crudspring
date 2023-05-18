package dev.leomarques.pjava.records;

import dev.leomarques.pjava.entities.Endereco;

public record DadosCadastroPessoa(
		
		String nome, 
		String cpf, 
		String telefone,
		String email, 
		Endereco endereco) {

}
