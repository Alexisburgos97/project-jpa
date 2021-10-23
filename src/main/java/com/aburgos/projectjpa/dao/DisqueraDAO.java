/**
 * 
 */
package com.aburgos.projectjpa.dao;

import java.util.List;

import com.aburgos.projectjpa.entity.Disquera;

/**
 * @author Alexis
 *
 * Interfaz que genera el dao para las transacciones del CRUD a la tabla de disquera.
 */
public interface DisqueraDAO {

	public void guardar(Disquera disquera);
	
	public void actualizar(Disquera disquera);
	
	public void eliminar(Long id);
	
	List<Disquera> consultar();
	
	Disquera consultarById(Long id);
}
