package ar.edu.unju.fi.tp4.model;

import org.springframework.stereotype.Component;

/**
 * aqui va la clase java principal con sus atributos y sus constuctores
 * @author matia
 *
 */

@Component
public class Producto {

	private int codigo;
	private String nombre;
	private double precio;
	private String marca;
	private int stock;
	


public Producto(){
	
}



/**
 * @return the codigo
 */
public int getCodigo() {
	return codigo;
}



/**
 * @param codigo the codigo to set
 */
public void setCodigo(int codigo) {
	this.codigo = codigo;
}



/**
 * @return the nombre
 */
public String getNombre() {
	return nombre;
}



/**
 * @param nombre the nombre to set
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}



/**
 * @return the precio
 */
public double getPrecio() {
	return precio;
}



/**
 * @param precio the precio to set
 */
public void setPrecio(double precio) {
	this.precio = precio;
}



/**
 * @return the marca
 */
public String getMarca() {
	return marca;
}



/**
 * @param marca the marca to set
 */
public void setMarca(String marca) {
	this.marca = marca;
}



/**
 * @return the stock
 */
public int getStock() {
	return stock;
}



/**
 * @param stock the stock to set
 */
public void setStock(int stock) {
	this.stock = stock;
}



@Override
public String toString() {
	return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", marca=" + marca + ", stock="
			+ stock + "]";
}
	




	
	
	




}
