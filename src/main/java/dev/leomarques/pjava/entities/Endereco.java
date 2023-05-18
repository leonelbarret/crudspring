package dev.leomarques.pjava.entities;

import java.util.Objects;

import dev.leomarques.pjava.records.DadosEndereco;
import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {
	
	private String logradouro;
	private String bairro;
	private String cidade;
	private String cep;
	private String numero;
	private String complemento;
	private String uf;
	
	public Endereco() {
			}
	
	public Endereco(String logradouro, String bairro, String cidade, String cep, String numero, String complemento,
			String uf) {
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
		this.uf = uf;
	}

	
	
	public String getLogradouro() {
		return logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getCep() {
		return cep;
	}

	public String getNumero() {
		return numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getUf() {
		return uf;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bairro, cep, cidade, complemento, logradouro, numero, uf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(cep, other.cep)
				&& Objects.equals(cidade, other.cidade) && Objects.equals(complemento, other.complemento)
				&& Objects.equals(logradouro, other.logradouro) && Objects.equals(numero, other.numero)
				&& Objects.equals(uf, other.uf);
	}
	
	
	public Endereco(DadosEndereco endereco) {
		this.logradouro =  endereco.logradouro();
		this.bairro = endereco.bairro();
		this.cidade = endereco.cidade();
		this.cep = endereco.cep();
		this.numero = endereco.numero();
		this.complemento = endereco.complemento();
		this.uf = endereco.uf();
	}

	public Endereco(Endereco endereco) {
		// TODO Auto-generated constructor stub
	}

	

	

}
