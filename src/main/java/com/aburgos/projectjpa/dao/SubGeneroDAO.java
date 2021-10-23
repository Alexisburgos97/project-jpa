/**
 * 
 */
package com.aburgos.projectjpa.dao;

import java.util.List;

import com.aburgos.projectjpa.entity.SubGenero;

/**
 * @author Alexis
 *
 */
public interface SubGeneroDAO {
	
	public void guardar(SubGenero subGenero);
	
	public void actualizar(SubGenero subGenero);
	
	public void eliminar(Long id);
	
	List<SubGenero> consultar();
	
	SubGenero consultarById(Long id);

}
