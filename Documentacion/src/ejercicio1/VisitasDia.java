package ejercicio1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * 
 * @author Ginger Gabriela
 * @version v1.2020
 *
 */
public class VisitasDia {
	
	private int[] diaVisita;
	
	private ArrayList<Visita> visitasFecha;

	/**
	 * Constructor de la clase
	 * @param diaVisita
	 */
	public VisitasDia(int[] diaVisita) {
		
	}

	/**
	 * Metodo guardar a un Fichero de Objectos
	 * @param fichero
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void guardarAFichero(String fichero) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero));
		oos.writeObject(visitasFecha);
		oos.close();
	}

	/**
	 * Metodo cargar visitas a Fichero
	 * @param fichero
	 *
	 */
	public int cargarVisitas(String fichero) throws FileNotFoundException, IOException, ClassNotFoundException {
		return -1;
	}
	/**
	 * Metodo que visualiza el fichero
	 * @param fichero
	 * 
	 */
	public static void verFichero(String fichero) throws FileNotFoundException, IOException, ClassNotFoundException {
	
	}
	/**
	 * Metodo que añade visita al arrayList
	 * @param visita
	 * 
	 */
	public boolean aniadeVisita(Visita v) throws IOException {
		return false;
	}
	/**
	 * Metodo statico que visualiza la hora correcta
	 * @param hora
	 * @return
	 * @throws IOException
	 */
	public static boolean horaCorrecta(int[] hora) throws IOException {
		return false;
		
	}
	/**
	 * Metodo que comprueba la hora de la visita
	 * @param hora
	 * @return
	 */
	public int numVisitantesHora(int[] hora) {
		return -1;
	}
	/**
	 * Metodo que actualiza la visita con el nombre de la persona encargada
	 * @param nombre
	 * @return
	 * @throws IOException
	 */
	public boolean actualizaVisita(String nombre) throws IOException {
		return false;
	}

	/**
	 * Metodo que crea un Informe en un archivo de texto
	 * 
	 */
	public void crearInforme() throws IOException {
		
	}
	/**
	 * Metodo que visualiza el arrayList y ve si hay visitas libre para x horas
	 * @return
	 * @throws IOException
	 */
	public HashMap<Integer, Integer> mapaLibres() throws IOException {
		return null;
	}
	/**
	 * Devuelve el tiempo de la Visita más cercano a la hora pasada como parámetro
	 * @param hora
	 * @param minutos
	 * @return
	 * 
	 */
	public int[] tiempoVisitaMasCercano(int hora, int minutos) throws IOException {
		return null;
	}
	/**
	 * Borra del ArrayList las visitas ya transcurridas a la hora actual
	 * @return
	 * @throws IOException
	 */
	public int borrarVisitasPasadas() throws IOException {
		return -1;
	}
	/**
	 * Verifica si el fichero esta correcto
	 * @param nomFichero
	 */
	public boolean chequearFichero(String nomFichero) throws IOException {
		return false;
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	}
}