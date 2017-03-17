package model;


/**
 * Creamos la clase display donde el operador ejecuta
 * @generated
 */

public class Display{
    String azucar,cafe,chocolate,te;
	
  

    /**
     * Seleccionar el producto
     */
    public void elegirBebida(){
        System.out.println("Seleccionar: te, cafe o chocolate");
     
    }
    /**
     * Añadir azucar al producto
     */
    public void añadirAzucar(){
        System.out.println("Azucar añadido");
    }
    /**
     * Saca por pantalla la elaboracion de la bebida
     */
	public void imprimirEstado() {
		          System.out.println("Elaborando bebida");
	}
/**
 * sonido de la alrma
 */
	public void alarma() {
		          System.out.println("ALARMA");
	}

	/**
         * Mostrar el mensaje de producto terminado
         */
	public void imprimir() {
		          System.out.println("Producto terminado");
	}

}

