/**
 * Realizamos los imports para que los "@tests" funcionen.
 * La clase consiste de cuatro tests, en los que probamos los dos métodos.
 * cada test se explica en la parte de arriba del test correspondiente.
 *
 * @author theXx
 * @version: 1.0 (definitiva del trabajo).
 *
 */

package testJU5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSoldado {

/** 
 * Test 1: "testDisparoTrue": Le asignamos dos balas al soldado para que el método devuelva true.
 * 
 * En todos los tests, vamos a crear un nuevo objeto vacío para poder asignarle los valores requeridos para poder realizar los tests.
 */
	@Test
	public void testDisparoTrue() {
	
		Soldado soldado1 = new Soldado();
		soldado1.setNumeroBalas(2);
		
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = soldado1.puedeDisparar();
		
	assertEquals (resultadoObtenido, resultadoEsperado);
	}
	
/** 
 * Test 2: "testDisparoFalse": Le asignamos cero balas al soldado, para que el método devuelva false.
 * 
 */
	
	@Test
	public void testDisparoFalse() {
	
		Soldado soldado1 = new Soldado();
		soldado1.setNumeroBalas(0);
		
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = soldado1.puedeDisparar();
		
		assertEquals (resultadoObtenido, resultadoEsperado);
	}
	
	/**
	 * Test 3: "testMuertoTrue": Le hemos asignado tres balas, para que pueda disparar y por lo tanto el soldado enemigo aparecerá muerto.
	 */
	
	@Test
	public void testMuertoTrue() {
		
		Soldado soldado1 = new Soldado();
		soldado1.setNumeroBalas(3);
		soldado1.disparar(soldado1);
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = soldado1.isEstaMuerto();
		
		
		assertEquals (resultadoObtenido, resultadoEsperado);
	}
	
	/**
	 *  Test 4: "TestMuertoFalse": Le asignamos cero balas al soldado, por lo que el método devolverá false.
	 */
	
	@Test
	public void testMuertoFalse() {
		
		Soldado soldado1 = new Soldado();
		soldado1.setNumeroBalas(0);
		soldado1.disparar(soldado1);
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = soldado1.isEstaMuerto();
		
		assertEquals (resultadoObtenido, resultadoEsperado);
	}
	
	
	
	
	
	
	
	 
}
