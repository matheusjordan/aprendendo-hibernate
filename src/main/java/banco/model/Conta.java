package banco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conta {
	
	@Id @GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	private String numero;
	private Double saldo;
	
	public Conta(String numero, Double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public Long getId() {
		return id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
}
