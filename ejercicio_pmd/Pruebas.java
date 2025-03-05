package ejercicio_pmd;

import java.util.logging.Logger;

/**
 * @author Pablo
 */
public class Pruebas {
    /**
     * Parametro del log
     */
    /* default */ Logger log = Logger.getLogger(Pruebas.class.getName());
    /**
     * Constructor que llama al metodo sumar con los numeros 23 y 43.
     * @param numero1 recibe el primer numero.
     * @param numero2 rrecibe el segundo numero.
     */
    public Pruebas(final int numero1, final int numero2) {
        sumar(numero1, numero2);
    }
    /**
     * Metodo para sumar
     * @param numero1 Recibe el primer numero de la suma
     * @param numero2 Recibe el segundo numero de la suma
     * @return Devuelve la suma del numero1 y el numero2.
     */
    private int sumar(final int numero1, final int numero2) {
        return numero1 + numero2;
    }

    /**
     * Metodo que imprime un "no hace nada"
     */
    public void noHaceNada() {
        log.fine("No hace nada");
    }

    /**
     * El metodo imprime el valor de numero.
     * @param numero Recibe un numero
     */
    public void preguntaVacia(final int numero) {
        log.fine("Pregunta vacia");
    }

    /**
     * Metodo que imprime una operacion.
     */
    public int bloqueTryCatchVacio() {
        return 10 / 0;
    }
}
