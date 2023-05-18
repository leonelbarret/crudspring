package dev.leomarques.pjava.entities;


import java.util.Objects;

import dev.leomarques.pjava.records.DadosCadastroPessoa;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Column(name = "nome")
	String nome;
	@Column(name = "cpf")
	String cpf;
	@Column(name = "telefone")
	String telefone;
	@Column(name = "email")
	String email;
	
	@Embedded
	Endereco endereco;
	
	public Pessoa() {
		}

	public Pessoa(Long id, String nome, String cpf, String telefone, String email, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, email, endereco, id, nome, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(email, other.email)
				&& Objects.equals(endereco, other.endereco) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome) && Objects.equals(telefone, other.telefone);
	}

	
	public Pessoa(DadosCadastroPessoa dados) {
		this.nome = dados.nome();
		this.cpf = dados.cpf();
		this.telefone = dados.telefone();
		this.email = dados.email();
		this.endereco = new Endereco(dados.endereco());
	}
	
	
	

}
