package ar.edu.unju.fi.tp4.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp4.model.Compra;
import ar.edu.unju.fi.tp4.model.Producto;
/**
 * aqui va el cuerpo de los metodos
 * @author Familia
 *
 */

@Service
public class CompraServiceImp {
	@Autowired
	Compra compra;
	
	List<Compra> compras = new ArrayList<Compra>();
	
	
	public void addCompra(Compra compra) {
		// TODO Auto-generated method stub
		this.compras.add(compra);
	}

	

	public Compra getCompra() {
		this.compra.setId(1234);
		return this.compra;
		
		
	}

}
