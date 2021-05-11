package ar.edu.unju.fi.tp4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.tp4.model.Producto;
import ar.edu.unju.fi.tp4.service.IProductoService;

@Controller
public class ProductoController {
	
	@Autowired
	IProductoService productoService;
	
	
	
	@GetMapping("/producto")
	public String getProductoPage(Model model) {
		model.addAttribute("producto",productoService.getProducto());
		return "nuevo";
	}
	
	@PostMapping("/producto/guardar")
	public String getProductoResultadoPage(@ModelAttribute("producto") Producto unProducto) {
		productoService.addProducto(unProducto);
		return "resultado";
		
	}
	
	@GetMapping("empleado/ultimoproducto")
	public ModelAndView getUltimoProductoPage() {
		
		ModelAndView modelView = new ModelAndView("ultimoproducto");
		
		modelView.addObject("producto", productoService.getUltimoProducto());
		return modelView;
		
	}
}
