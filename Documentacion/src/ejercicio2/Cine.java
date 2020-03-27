package ejercicio2;

import java.util.ArrayList;
/**
 * 
 * @author Ginger Gabriela 
 * @version v1.2020
 * @since 16-03-20
 *
 */
public class Cine {

	/**
	 * Atributo nombre
	 */
	private String nombre;
	/**
	 * Atributo ArrayList de Peliculas: listaPeliculas
	 */
	private ArrayList<Pelicula> listaPeliculas;
	/**
	 * Atributo de la clase Pelicula: salas Ocupadas
	 */
	private Pelicula[] salasocupadas;

	/**
	 * Constructor de Cine con 2 parametros
	 *
	 * @param nombre
	 * @param numSalas
	 */
	public Cine(String nombre, int numSalas) {
		
	}
	
	/**
	 * Metodo que añade una pelicula y la verifica con el metodo esIgual
	 * si ya esta no la añade 
	 * @param nombrepeli
	 * @param duracion
	 * @param anio
	 * @return
	 */
	public int salaPeli(String nombrepeli, int duracion, int anio) {
		return -1;
	}

	/**
	 * Metodo que recibe una pelicula pasada como parametro y la añade
	 * @param pelicula
	 */
	public void anadePeli(Pelicula pelicula) {

	}

	/**
	 * Metodo que recibe una pelicula y un numero de sala y la añade
	 * @param pelicula
	 * @param numSala
	 */
	public void anadePeli(Pelicula pelicula, int numSala) {

	}

	/**
	 * Metodo que visualuza el nombre del cine y sus peliculas
	 * Ejemplo:
	 * Ejemplo
	 * Cine FLORIDA
	 *  J.Edgar –Sala 2
	 *  Millenium – Sala 3
	 *  The Artist – Sala 7
	 */
	public void ver() {

	}

	/**
	 * Metodo que quita una pelicula cuyo nombre se pasa por parametro y empieza por dichos caracteres
	 * @param nombre
	 */
	public void quitaPeli(String nombre) {

	}

	/**
	 * Metodo que devuelve un arraylist con los números de las salas libres del cine.
	 * @return
	 */
	public int[] libres() {
		return null;
	}
	/**
	 * Metodo que recibe una pelicula
	 * Se cambiara de sala siempre y cuando la sala se encuentre libre
	 * @param pelicula
	 */

	public void cambiaDeSala(Pelicula pelicula) {

	}

	/**
	 * Metodo que verifica si la pelicula ya esta añadida y a que sala corresponde
	 * @param array
	 * @param sala
	 * @return
	 */
	public static boolean yaEsta(int[] array, int sala) {
		return false;
	}

	/**
	 * Metodo que elimina todas las peliculas del cine
	 */
	public void reseteaCine() {

	}

	/**
	 * Metodo que guarda las peliculas mas cortas
	 * @param duracion
	 * @return
	 */
	public ArrayList<Pelicula> pelisMasCortas(int duracion) {
		return null;
	}

	/**
	 * Metodo que guarda las peliculas dependiendo de la hora y minutos pasada como parametro
	 * @param horas
	 * @param minutos
	 * @return
	 */
	public ArrayList<Pelicula> pelisMasCortas(int horas, int minutos) {
		return null;
	}
}
