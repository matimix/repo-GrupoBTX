package ar.edu.unju.fi.tp4.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "CUENTAS")
public class Cuenta {
	private Long id;
	private Double saldo;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaDeCreacion;
	private String estado;
	
	public Cuenta() {
		// Auto-generated
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the saldo
	 */
	public Double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the fechaDeCreacion
	 */
	public LocalDate getFechaDeCreacion() {
		return fechaDeCreacion;
	}

	/**
	 * @param fechaDeCreacion the fechaDeCreacion to set
	 */
	public void setFechaDeCreacion(LocalDate fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cuenta [id=" + id + ", saldo=" + saldo + ", fechaDeCreacion=" + fechaDeCreacion + ", estado=" + estado
				+ "]";
	}

	
	
}
