 import java.util.ArrayList;

import java.util.Random;
  
/**
 * Esta clase define objetos que contienen tanto enteros aleatorios entre como
 * se definen al crear el objeto
 * @see <a href="https://aprenderaprogramar.com/foros/index.php?board=1.0">aprendeaprogramar.com - Didáctica en programación</a>
 * 
 *
 */

public class SerieDeAleatoriosD {

 

    //Campos de la clase
	/*
	 * 
	 */
    private ArrayList<Integer> serieAleatoria;


    /**
     * Constructor para la serie de números aleatorios
     * @param numeroItems -El parámetro numeroItems define el número de elementos que va a tener la serie aleatoria
     */
    public SerieDeAleatoriosD (int numeroItems) {

        serieAleatoria = new ArrayList<Integer> ();

        for (int i=0; i<numeroItems; i++) {  serieAleatoria.add(0);  }

        System.out.println ("Serie inicializada. El número de elementos en la serie es: " + getNumeroItems() );

    } //Cierre del constructor

    /**
     * Método que devuelve el número de ítems (números aleatorios) existentes en la serie
     * @return El número de ítems (números aleatorios) de que consta la serie
     */

    public int getNumeroItems() { return serieAleatoria.size(); }


    /**
     * Método que genera la serie de números aleatorios
     */
    public void generarSerieDeAleatorios () {

        Random numAleatorio;

        numAleatorio = new Random ();

        for (int i=0; i < serieAleatoria.size(); i++) { serieAleatoria.set(i, numAleatorio.nextInt(1000) ); }

        System.out.print ("Serie generada! ");

    } //Cierre del método

} //Cierre de la clase y del ejemplo aprenderaprogramar.com