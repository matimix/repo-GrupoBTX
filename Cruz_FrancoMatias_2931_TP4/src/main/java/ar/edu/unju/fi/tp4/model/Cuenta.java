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

}
