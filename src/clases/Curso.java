package clases;

public class Curso {
	
		public void ejecutar() {
			Asignaturas [] asignaturas = altaAsignaturas(); 
			Alumno [] alumnos = altaAlumnos(asignaturas);
			Profesor [] profesores = altaProfesores(asignaturas);
			comenzarCurso(asignaturas, alumnos, profesores);
		}
		
		protected Profesor [] altaProfesores(Asignaturas [] asignaturas) {
			Profesor [] profesores = new Profesor[4];
			Asignaturas [] asignaturasGuillamon = {asignaturas[0], asignaturas[4]};
			Asignaturas [] asignaturasPaco = {asignaturas[3]};
			Asignaturas [] asignaturasLidia = {asignaturas[1]};
			Asignaturas [] asignaturasDavid = {asignaturas[2]};
			profesores [0] = new Profesor ("Lidia", "Gonzalez", "11", "11I");
			profesores [0].setAsignatura(asignaturasLidia);
			profesores [1] = new Profesor ("Jose Manuel", "Guillamon", "22", "22+I");
			profesores [1].setAsignatura(asignaturasGuillamon);
			profesores [2] = new Profesor ("Paco", "Martos", "33", "33I");
			profesores [2].setAsignatura(asignaturasPaco);
			profesores [3] = new Profesor ("David", "Postigo", "44", "44I");
			profesores [3].setAsignatura(asignaturasDavid);
			return profesores;
		}
		
		protected Alumno [] altaAlumnos(Asignaturas [] asignaturas) {
			Alumno [] alumnos = new Alumno[5];
			alumnos [0] = new Alumno("Luna", "Costa", "1");
			alumnos [0].setAsignatura(asignaturas);
			alumnos [1] = new Alumno("Francisco Javier", "Herencia", "2");
			alumnos [1].setAsignatura(asignaturas);
			alumnos [2] = new Alumno("Alberto", "Claros", "3");
			alumnos [2].setAsignatura(asignaturas);
			alumnos [3] = new Alumno("Alexis", "Jimenez", "4");
			alumnos [3].setAsignatura(asignaturas);
			alumnos [4] = new Alumno("Gonzalo", "Fuentes", "5");
			alumnos [4].setAsignatura(asignaturas);
			return alumnos;
		}
		public Asignaturas [] altaAsignaturas () {
			Asignaturas [] asignaturas = new Asignaturas [5];
			
			Asignaturas aProgramacion = new Asignaturas ();
			aProgramacion.setNombre("Programación");
			aProgramacion.setHoras(256);
			asignaturas [0] = aProgramacion;
			
			Asignaturas asignatura = new Asignaturas ("Bases de Datos", 220);
			asignaturas [1] = asignatura;
			
			asignatura = new Asignaturas("Lenguaje de Marcas", 96);
			asignaturas[2]=asignatura;
			
			asignaturas[3] = new Asignaturas("Sistemas Informáticos", 200);
			asignaturas[4] = new Asignaturas ("Sostenibilidad", 3);
			
			return asignaturas;
		}
		
		protected void comenzarCurso(Asignaturas[] asignaturas, Alumno [] alumnos, Profesor [] profesores) {
			presentarAsignaturas (asignaturas);
			presentarAlumnos (alumnos, asignaturas);
			presentarProfesores (profesores, asignaturas);
			//presentarProfesores (profesores);
			//presentarAlumnos (alumnos);
		}
		
		protected void presentarProfesores (Profesor [] profesores, Asignaturas [] asignaturas) {
			System.out.println("Presentación de los profesores");
			for (int i = 0; i < profesores.length; i++) {
				System.out.println("Soy el profesor "+profesores[i].getNombre()+ " y mi IBAN es: "+profesores[i].getIban());
				presentarAsignaturas(profesores[i].getAsignatura());
				profesores[i].irAClase();
				profesores[i].hacerExamen();
			}
		}
		protected void presentarAsignaturas(Asignaturas[] asignaturas) {
			int horas = 0;
			System.out.println("\tPresentación de asignaturas: ");
			for (int i = 0; i < asignaturas.length; i++) {
				System.out.println("Soy la asignatura "+asignaturas[i].getNombre()+ " y duro "+asignaturas[i].getHoras()+ " horas.");
				horas += asignaturas[i].getHoras();
			}
			System.out.println("El total de horas es de: "+horas+" horas.");
		}
		
		protected void presentarAlumnos (Alumno [] alumnos, Asignaturas [] asignaturas) {
			System.out.println("Presentación de alumnos: ");
			for (int i = 0; i < alumnos.length; i++) {
				System.out.println("Soy el alumno "+ alumnos[i].getNombre()+ " "+alumnos[i].getPrimerApellido());
				presentarAsignaturas(asignaturas);
				alumnos[i].irAClase();
				alumnos[i].hacerExamen();
			}
		}
	
}
