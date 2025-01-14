package clases;

public class Curso {
	
	public void ejecutar() {
		Asignaturas [] asignaturas = altaAsignaturas(); 
		comenzarCurso(asignaturas);
	}
		public Asignaturas [] altaAsignaturas () {
			Asignaturas [] asignaturas = new Asignaturas [8];
			
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
		
		protected void comenzarCurso(Asignaturas[] asignaturas) {
			presentarAsignaturas (asignaturas);
			//presentarProfesores (profesores);
			//presentarAlumnos (alumnos);
		}
		
		protected void presentarAsignaturas(Asignaturas[] asignaturas) {
			int horas = 0;
			for (int i = 0; i < asignaturas.length; i++) {
				System.out.println("Soy la asignatura "+asignaturas[i].getNombre()+ " y duro "+asignaturas[i].getHoras());
				horas += asignaturas[i].getHoras();
			}
			System.out.println("El total de horas es de: "+horas);
		}
	
}
