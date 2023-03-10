package javabean;

import java.util.Objects;

/**
 * Entidad 'Soldado'
 * 
 * @author FelixDePablo & JulianMendez
 * @version 1.1
 *
 */

public class Soldado {
	
	// ATRIBUTOS PRIVADOS

	private boolean estaMuerto;
	private int numeroBalas;
	
	// MÉTODOS CONSTRUCTORES
	
	public Soldado() {
		super();
	}
	
	public Soldado(boolean estaMuerto, int numeroBalas) {
		super();
		this.estaMuerto = estaMuerto;
		this.numeroBalas = numeroBalas;
	}

	// GETTERS AND SETTER

	public boolean getEstaMuerto() {
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

	// METODOS toString() hasCode() y equals() redefinidos
	
	@Override
	public String toString() {
		return "Soldado [estaMuerto=" + estaMuerto + ", numeroBalas=" + numeroBalas + "]";
	}	
	
	@Override
	public int hashCode() {
		return Objects.hash(estaMuerto, numeroBalas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Soldado other = (Soldado) obj;
		return estaMuerto == other.estaMuerto && numeroBalas == other.numeroBalas;
	}

	
	//MÉTODOS
	
	/**
	 * Método que nos dice si un soldado puede disparar.<br><br>
	 * Si el número de balas es mayor que 0 y está vivo puede disparar.<br>
	 * Si el número de balas es menor que 1 y está vivo no puede disparar.<br>
	 * Si está muerto no puede disparar.<br>
	 * 
	 * @return Devuelve TRUE si el soldado puede disparar. <br>
	 * Devuelve FALSE si el soldado no puede disparar.
	 * 
	 */
	public boolean puedeDisparar() {
		if (this.numeroBalas > 0 ) {
			return true;
		}
		return false;
	}

	/**
	 * Método para que el soldado realice la acción 'disparar' <br><br>
	 * 
	 * Cuando un soldado dispara pierde una bala.<br>
	 * El soldado al que dispara muere.<br>
	 * 
	 * @param sol : Se pasa un soldado que va a ser disparado.
	 * 
	 */
	public void disparar(Soldado sol) {
		this.numeroBalas--;
		sol.estaMuerto = true;
	}

}
