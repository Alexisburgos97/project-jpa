/**
 * 
 */
package com.aburgos.projectjpa.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.aburgos.projectjpa.dao.DisqueraDAO;
import com.aburgos.projectjpa.dao.impl.DisqueraDAOImpl;
import com.aburgos.projectjpa.entity.Disquera;

/**
 * @author Alexis
 *
 */
class DisqueraDAOImplTest {
	
	private DisqueraDAO disqueraDAO = new DisqueraDAOImpl();

	/**
	 * Test method for {@link com.aburgos.projectjpa.dao.impl.DisqueraDAOImpl#guardar(com.aburgos.projectjpa.entity.Disquera)}.
	 */
	
	@Test
	void testGuardar() {
		Disquera disquera = new Disquera();
		
		disquera.setDescripcion("Album tango");
		disquera.setFechaCreacion(LocalDateTime.now());
		disquera.setEstatus(true);
		
		this.disqueraDAO.guardar(disquera);
	}

	/**
	 * Test method for {@link com.aburgos.projectjpa.dao.impl.DisqueraDAOImpl#actualizar(com.aburgos.projectjpa.entity.Disquera)}.
	 */
	@Test
	void testActualizar() {
		Disquera disquera = this.disqueraDAO.consultarById(9L);
		
		disquera.setDescripcion("Album cumbia");
		
		this.disqueraDAO.actualizar(disquera);
		
	}

	/**
	 * Test method for {@link com.aburgos.projectjpa.dao.impl.DisqueraDAOImpl#eliminar(com.aburgos.projectjpa.entity.Disquera)}.
	 */
	@Test
	void testEliminar() {
		Long id = 9L;
		
		this.disqueraDAO.eliminar(id);
	}

	/**
	 * Test method for {@link com.aburgos.projectjpa.dao.impl.DisqueraDAOImpl#consultar()}.
	 */
	@Test
	void testConsultar() {
		List<Disquera> disquerasConsultadas = this.disqueraDAO.consultar();
		
		assertTrue(disquerasConsultadas.size() > 0);
		
		disquerasConsultadas.forEach( disquera -> {
			System.out.println("Disquera : " + disquera.getDescripcion());
		});
		
	}

	/**
	 * Test method for {@link com.aburgos.projectjpa.dao.impl.DisqueraDAOImpl#consultarById(java.lang.Long)}.
	 */
	@Test
	void testConsultarById() {
		Disquera disquera = this.disqueraDAO.consultarById(3L);
		
		assertNotNull(disquera);
		
		System.out.println("Disquera: " + disquera.getDescripcion());
	}
	
	@Test
	void testConsultarByDescripcionJPQL() {
		
		Disquera disqueraConsultada = this.disqueraDAO.consultarByDescripcionJPQL("Album cumbia");
		
		assertNotNull(disqueraConsultada);
		
		System.out.println("Disquera by descripción: " + disqueraConsultada.getDescripcion());
		
	}
	
	@Test
	void testConsultarByDescripcionNative() {
		Disquera disqueraConsultada = this.disqueraDAO.consultarByDescripcionJPQL("Album cumbia");
		
		assertNotNull(disqueraConsultada);
		
		System.out.println("Disquera by descripción: " + disqueraConsultada.getDescripcion());
	}

}
