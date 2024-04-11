package ludoteca;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

public class Ludoteca {
	
	public static Actividad actividadMasPopular(ArrayList<Actividad> actividades) {
		Actividad actividadMasAsistentes = actividades.get(0);
		
		for (Actividad actividad : actividades) {
			if (actividad.getAsistentes().size() > actividadMasAsistentes.getAsistentes().size()) {
				actividadMasAsistentes = actividad;
			}
		}
		return actividadMasAsistentes;
	}
	
	public static ArrayList<Recurso> recursosReservables(ArrayList<Recurso> recursos) {
		ArrayList<Recurso> librosReservables = new ArrayList<Recurso>();
		
		for (Recurso recurso : recursos) {
			if (recurso instanceof Libro && ((Libro) recurso).getReservado() == null) {
				librosReservables.add(recurso);
			}
		}
		return librosReservables;
	}
	
	public static void main(String[] args) {
		// Lista de recursos de la ludoteca
		ArrayList<Recurso> recursos = new ArrayList<Recurso>(Arrays.asList(
			new Libro("La historia interminable", "Michael Ende", "fantasía", null),
			new Libro("Frankstein", "Mary Shelley", "terror", null),
			new Libro("Persepolis", "Marjane Satrapi", "comic", "87654321-X"),
			new Libro("Los cuentos de Terramar", "Ursula K. Le Guin", "fantasía", "12345678-Z"),
			new Libro("Las estrellas son legión", "Kameron Hurley", "ciencia-ficción", null),
			new Juego("Catan", 45, 10),
			new Juego("Virus!", 15, 8),
			new Juego("Carcassonne", 30, 7),
			new Juego("Catan", 45, 10),
			new Juego("Catan", 45, 10),
			new Videoconsola("Nintendo", "Switch"),
			new Videoconsola("Nintendo", "Wii"),
			new Videoconsola("Nintendo", "3DS"),
			new Videoconsola("Sony", "PlayStation 5"),
			new Videoconsola("Sony", "PlayStation 4"),
			new Videoconsola("Sony", "PlayStation 3"),
			new Videoconsola("Sony", "PlayStation 2"),
			new Videoconsola("Microsoft", "XBOX 360"),
			new Videoconsola("Microsoft", "XBOX One"),
			new Videoconsola("Microsoft", "Series S")
		));
		
		// Lista de actividades de la ludoteca
		ArrayList<Actividad> actividades = new ArrayList<Actividad>(Arrays.asList(
			new Actividad("Teatro: Una habitación propia", LocalDateTime.now(), new ArrayList<String>(Arrays.asList("12345678-Z", "87654321-X"))),
			new Actividad("Conferencia: El calentamiento global", LocalDateTime.now(), new ArrayList<String>(Arrays.asList("87654321-X"))),
			new Actividad("Película: Interstellar", LocalDateTime.now(), new ArrayList<String>(Arrays.asList("12345678-Z"))),
			new Actividad("Taller de robótica", LocalDateTime.now(), new ArrayList<String>(Arrays.asList("12345678-Z", "87654321-X", "34567890-V"))),
			new Actividad("Taller de juegos de mesa", LocalDateTime.now(), new ArrayList<String>())
		));
		
		System.out.println("Actividades de la ludoteca...");
		for (Actividad actividad : actividades) {
			System.out.println(actividad);
		}
		
		System.out.println("###########");
		System.out.println("Id primer recurso: ");
		Recurso recurso1 = recursos.get(0);
		System.out.println(recurso1.toString());
		
		System.out.println("###########");
		System.out.println("Id sexto recurso: ");
		Recurso recurso6 = recursos.get(5);
		System.out.println(recurso6.toString());
		
		System.out.println("###########");
		System.out.println("Id decimoprimer recurso: ");
		Recurso recurso11 = recursos.get(10);
		System.out.println(recurso11.toString());
		
		System.out.println("###########");
		Juego juego1 = new Juego("Catan", 45, 10);
		System.out.println("El juego " + juego1.toString() + " es familiar: " + juego1.esFamiliar());
		
		Juego juego2 = new Juego("Parchis", 25, 9);
		System.out.println("El juego " + juego2.toString() + " es familiar: " + juego2.esFamiliar());
		
		System.out.println("###########");
		Libro libro1 = new Libro("Los cuentos de Terramar", "Ursula K. Le Guin", "fantasía", "12345678-Z");
		System.out.println("El libro " + libro1.toString() + " es familiar: " + libro1.esFamiliar());
		
		Libro libro2 = new Libro("Los cuentos de Terramar", "Ursula K. Le Guin", "humor", "12345678-Z");
		System.out.println("El libro " + libro2.toString() + " es familiar: " + libro2.esFamiliar());
		
		System.out.println("###########");
		Videoconsola videoconsola1 = new Videoconsola("Nintendo", "Switch");
		System.out.println("La videoconsola " + videoconsola1.toString() + " es familiar: " + videoconsola1.esFamiliar());
		
		Videoconsola videoconsola2 = new Videoconsola("Microsoft", "XBOX One");
		System.out.println("La videoconsola " + videoconsola2.toString() + " es familiar: " + videoconsola2.esFamiliar());
		
		System.out.println("###########");
		ArrayList<Juego> juegosDesordenados = new ArrayList<Juego>(Arrays.asList(
				new Juego("Catan", 45, 10),
				new Juego("Virus!", 15, 8),
				new Juego("Carcassonne", 30, 7),
				new Juego("Catan", 45, 10),
				new Juego("Catan", 45, 10)
			));
		System.out.println(juegosDesordenados.toString());
		
		Collections.sort(juegosDesordenados);
		System.out.print("Juegos ordenados por edad: ");
		System.out.println(juegosDesordenados.toString());

		System.out.println("###########");
		System.out.print("Actividad con más asistentes: ");
		System.out.println(actividadMasPopular(actividades).toString());
		
		System.out.println("###########");
		System.out.print("Libros reservables: ");
		System.out.println(recursosReservables(recursos).toString());
	}
}
