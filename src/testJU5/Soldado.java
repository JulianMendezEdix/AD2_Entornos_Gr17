/**
 * En esta clase proporcionada por usted, se encuetra el código referente a la clase Soldado, con dos métodos;
 * 
 * En el primero, muestra si puede disparar mediante una condición que resulte true.
 * En el segundo, Dispara, y si tiene balas en el cargador, le resta una y mata al enemigo.
 * 
 * @author Enrique vázquez
 * @version 1.0 (Definitiva del ejercicio).
 * 
 */

package testJU5;

public class Soldado {
	
// Declaración de variables.

	private boolean estaMuerto;
	private int numeroBalas;
	
/**
 * Primer método: "puedeDisparar": Si el nº de balas es igual o superior a 1, devolverá true. 
 * De lo contrario, devolverá false.
 * @return: Si es true, es que puede disparar.
 */

	
	public boolean puedeDisparar() {
		
		if(this.numeroBalas > 0) {
			
			return true;
			
		}
		else
			
		return false;
	}
	
/** 
 * Segundo método: "disparar": Añadí la condición para comprobar si el soldado tiene balas.
 * Si es así, se le resta una bala del cargador y el soldado enemigo aparece como muerto.
 * 
 *  Personalmente no soy capaz de realizar la prueba unitaria sin añadir la condición if
 *  
 * @param sol: identifica al soldado enemigo, que en caso de que el resultado sea true, morirá.
 */
	
	public void disparar(Soldado sol) {
		
		if (numeroBalas > 0) {
			this.numeroBalas--;	
			sol.estaMuerto = true;

		}
		else 
			sol.estaMuerto = false;
	}
	
// Métodos getter and setter para asignar valores para realizar los tests pertinentes.
	
	public boolean isEstaMuerto() {
		return estaMuerto;
	}

	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}

	public int getNumeroBalas() {
		return numeroBalas;
	}

	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}


// Constructor con parámetros; permite asignar futuros valores a estas propiedades del objeto.

	public Soldado(boolean estaMuerto, int numeroBalas) {
		super();
		this.estaMuerto = estaMuerto;
		this.numeroBalas = numeroBalas;
	}

// Constructor sin parámetros.

	public Soldado() {
		super();
	}
	
	
	
	
}
