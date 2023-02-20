/**
 * Realizamos los imports para que los "@tests" funcionen.
 * La clase consiste de seis tests, en los que probamos los dos métodos.
 * cada test se explica en la parte de arriba del test correspondiente.
 * El segundo método está dividido en cuatro tests, dos para las tarjetas amarillas y dos para las rojas.
 *
 * @author theXx
 * @version: 1.0 (definitiva del trabajo).
 *
 */
package testJU5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testJugador {

/** Test 1: "TestDorsalTrue": Comprobamos que funciona con el nº de dorsal 30.
 * 
 *  En todos los tests, vamos a crear un nuevo objeto vacío para poder asignarle los valores requeridos para poder realizar los tests.
 */

	@Test
	public void TestDorsalTrue() {
		Jugador jug1 = new Jugador();
		jug1.ponerDorsal(30);
		
		int resultadoEsperado = 30;
		int resultadoObtenido = jug1.getDorsal();
		
		assertEquals (resultadoEsperado, resultadoObtenido);
	}
	
/**
 * Test2: "TestDorsalFalse": Aquí introducimos un dato fuera de rango para ver que efectivamente devuelva -1.
 */
	
	@Test
	public void TestDorsalFalse() {
		Jugador jug1 = new Jugador();
	
		
		int resultadoEsperado = -1;
		int resultadoObtenido = jug1.ponerDorsal(31);
		
		assertEquals (resultadoEsperado, resultadoObtenido);
	}
	
/**
 * Test3: "TestTarjAmTrue": Asignamos al jugador dos tarjetas amarillas, para que se cumpla la condición y devuelva true. 
 */
	
	@Test
	
	public void TestTarjAmTrue() {
		
	Jugador jug1 = new Jugador();
	jug1.setNumeroTarjetasAmarillas(2);
	
	boolean resultadoEsperado = true;
	boolean resultadoObtenido = jug1.estaExpulsado();
	
	assertEquals(resultadoObtenido, resultadoEsperado);
	
	
	}
	
	
/**
 * Test4: "TestTarjAmFalse": le asignamos 1 tarjeta amarilla, para que el método devuelva false.
 */
	
@Test
	
	public void TestTarjAmFalse() {
		
	Jugador jug1 = new Jugador();
	jug1.setNumeroTarjetasAmarillas(1);
	
	boolean resultadoEsperado = false;
	boolean resultadoObtenido = jug1.estaExpulsado();
	
	assertEquals(resultadoObtenido, resultadoEsperado);
	
	
	}
	

/**
* Test5: "TestTarjRojaTrue": le asignamos 1 tarjeta roja, para que el método devuelva true.
*/

@Test

public void TestTarjrojTrue() {
	
Jugador jug1 = new Jugador();
jug1.setNumeroTarjetasRojas(1);

boolean resultadoEsperado = true;
boolean resultadoObtenido = jug1.estaExpulsado();

assertEquals(resultadoObtenido, resultadoEsperado);


}


/**
* Test6: "TestTarjAmFalse": le asignamos 0 tarjetas rojas, para que el método devuelva false.
*/

@Test
public void TestTarjrojFalse() {
	
Jugador jug1 = new Jugador();
jug1.setNumeroTarjetasRojas(0);

boolean resultadoEsperado = false;
boolean resultadoObtenido = jug1.estaExpulsado();

assertEquals(resultadoObtenido, resultadoEsperado);


}
	
}
