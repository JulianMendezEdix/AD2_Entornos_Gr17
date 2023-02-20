/**
 * En esta clase proporcionada por usted, se encuetra el código referente a la clase Jugador, con dos métodos;
 * 
 * El primero permite asignar un valor único a cada jugador (en este caso, el número del dorsal).
 * El segunto permite comprobar si el jugador que seleccionemos está expulsado, mediante la comprobación del número de tarjetas amarillas y rojas.
 *
 * @author Enrique vázquez
 * @version 1.0 (Definitiva del ejercicio).
 * 
 */

package testJU5;

public class Jugador {
	
// Declararción de variables.
	
	   private int dorsal;

       private int numeroTarjetasAmarillas;

       private int numeroTarjetasRojas;

/**
 *  Función "ponerDorsal": Permite asignar un dorsal a un jugador, asignándole ese valor único.
 * @param dorsal: valor único.
 * @return: Si se cumple, devolverá el mismo nº que hemos introducido.
 * 
 * Para poder testear la clase, he cambiado de void a int para poder añadir un return y así comprobar las variables.
 */
       
	  public int ponerDorsal(int dorsal) {

          if(dorsal >= 1 && dorsal <= 30) {

                       return this.dorsal = dorsal;

          }else {

                        
          
           return this.dorsal = -1;
          }
          
	  }
	  
/** Función "estaExpulsado": para comprobar si el jugador seleccionado ha sido expulsado
 * 	  
 * @return: si el numero de tarjetas amarillas es mayor que uno, y el de tarjetas rojas es mayor que cero, devolverá true.
 * Esto conlleva la expulsión del jugador seleccionado.
 */
	   public boolean estaExpulsado() {

           boolean expulsado = false;                                                  

           if(numeroTarjetasAmarillas == 2) {

                         expulsado = true;

           }                          

           if(numeroTarjetasRojas == 1) {

                         expulsado = true;

           }                          

           return expulsado;

}    

// Métodos getter and setter para asignar valores al objeto creado en la clase de testeo, y poder comprobar los tests.
	   
	public int getDorsal() {
		return dorsal;
	}


	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}


	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}


	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}


	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}


	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

// Constructor con parámetros; permite asignar futuros valores a estas propiedades del objeto.

	public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

//Constructor sin parámetros.

	public Jugador() {
		super();
	}
	  
	  
	  
}


