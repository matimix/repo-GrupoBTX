package ar.edu.unju.fi.tp4.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp4.model.Producto;
import ar.edu.unju.fi.tp4.service.IProductoService;


/**
 * aqui va el cuerpo completo de los metodos que utilizo
 * @author matia
 *
 */

@Service
public class ProductoServiceImp implements IProductoService{

	@Autowired
	Producto producto;
	
	List<Producto> productos = new ArrayList<Producto>();
	
	
	
	@Override
	public void addProducto(Producto producto) {
		// TODO Auto-generated method stub
		this.productos.add(producto);
	}

	@Override
	public Producto getUltimoProducto() {
		// TODO Auto-generated method stub
		int indiceUltimoElemento = productos.size() - 1;
		Producto producto = productos.get(indiceUltimoElemento); 
		return producto;
	}
	
	@Override
	public Producto getProducto() {
		this.producto.setCodigo(1234);
		return this.producto;
		
		
	}
	
}
