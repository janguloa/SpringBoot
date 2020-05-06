package com.istmosystem.inventario.repositorio;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.istmosystem.inventario.modelo.Productos;

@Repository
public interface ProductosRepositorio extends CrudRepository<Productos, String> {
	
	List<Productos> findAllByEstado(String estado);
	
	List<Productos> findAllByCodproducto(String codigo);
	
}