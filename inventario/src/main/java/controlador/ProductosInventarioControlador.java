package controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import modelo.ProductosInventario;
import servicio.ProductosInventarioServicio;

@RestController
@RequestMapping("")
public class ProductosInventarioControlador {
	
	@Autowired
	private ProductosInventarioServicio productosInventarioServicio;
	
	@RequestMapping("/productosInventario")
	@GetMapping
	public List<ProductosInventario> AllProductosInventario() {
		
		return productosInventarioServicio.findAllActives();
		
	}
	
	@RequestMapping("/productosInventarioCodigo")
	@GetMapping
	public List<ProductosInventario> listCodProductosInventario(){
		
		return productosInventarioServicio.findByCodigo();
	}
	
	@PostMapping("/crearproductosInventario")
	public ResponseEntity <ProductosInventario> crearProductosInventario(@RequestBody ProductosInventario productoInventario){
		
		return ResponseEntity.ok().body(this.productosInventarioServicio.CreateRegistry(productoInventario));
		
	}
}