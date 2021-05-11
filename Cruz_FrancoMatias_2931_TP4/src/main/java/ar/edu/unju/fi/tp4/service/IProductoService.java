package ar.edu.unju.fi.tp4.service;
import ar.edu.unju.fi.tp4.model.Producto;
public interface IProductoService {

	/**
	 * aqui van solo los nombres de los metodos
	 */
	public void addProducto(Producto producto);
	
	public Producto getUltimoProducto();
	
	public Producto getProducto();
}
