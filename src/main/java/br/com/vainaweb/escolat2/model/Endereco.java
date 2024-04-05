package br.com.vainaweb.escolat2.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Embeddable //Diz que essa classe pode ser incorporada
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {
	
	private String cep;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String complemento;
	private String uf;
	private Integer numero;
	
}