package grado;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Principal {
	
	public static double mediaAsignaturasPorCurso(ArrayList<Estudiante> estudiantes, int curso) {
		
		int totalEstudiantes = 0;
		int sumaAsignaturas = 0;
		
		for (Estudiante estudiante : estudiantes) {
			if (estudiante.getCurso() == curso) {
				sumaAsignaturas += estudiante.getMatricula().size();
				totalEstudiantes++;
			}
		}
		
		return (double) sumaAsignaturas/totalEstudiantes;
	}
	
	public static double cursoMedio(ArrayList<Estudiante> estudiantes) {
		
		int totalEstudiantes = estudiantes.size();
		int sumaCursos = 0;
		
		for (Estudiante estudiante : estudiantes) {
			sumaCursos += estudiante.getCurso();
		}
		
		return (double) sumaCursos/totalEstudiantes;
	}
	
	public static int totalAsignaturas(ArrayList<Estudiante> estudiantes) {
		int resutado = 0;
		
		for (Estudiante estudiante : estudiantes) {
			resutado += estudiante.getMatricula().size();
		}
		
		return resutado;
	}
	
	public static Estudiante masAsignaturas(ArrayList<Estudiante> estudiantes) {
		Estudiante mayor = estudiantes.get(0);
		
		for (Estudiante estudiante : estudiantes) {
			if (estudiante.getMatricula().size() > mayor.getMatricula().size()) {
				mayor = estudiante;
			}
		}
		
		return mayor;
	}

	public static void main(String[] args) {
		Grado informatica = new Grado();		
		informatica.setNombre("Ingeniería en Informática");
		
		ArrayList<Estudiante> estudiantesInfor = new ArrayList<Estudiante>();
		
		for (int i = 0; i < 100; i++) {
			ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();
			int curso = (int) (Math.random() * 4) + 1;
			int n = (int) (Math.random() * 5) + 8;
			
			for (int j = 0; j < n; j++) {
				Asignatura nueva = new Asignatura("asignatura-"+j, curso+j, curso, 6, LocalDateTime.now());
				asignaturas.add(nueva);
			}
					
			Estudiante nuevo = new Estudiante("estudiante-"+i, "123456"+i, curso, 
					new ArrayList<Asignatura>());
			
			nuevo.setMatricula(asignaturas);		
			estudiantesInfor.add(nuevo);
		}
		
		informatica.setEstudiantes(estudiantesInfor);
		
		System.out.println(informatica);
		informatica.ordenar();		
		System.out.println(informatica);
		
		System.out.println("Estudiante con más asignaturas: " + masAsignaturas(estudiantesInfor));
		System.out.println("Total asignaturas: " + totalAsignaturas(estudiantesInfor));
		System.out.println("Curso medio: " + cursoMedio(estudiantesInfor));
		System.out.println("Curso medio: " + mediaAsignaturasPorCurso(estudiantesInfor, 2));

	}

}
