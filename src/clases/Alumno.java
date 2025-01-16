package clases;

import java.util.Arrays;

public class Alumno extends Personas {
	
	public Alumno () {
		super();
	}

	public Alumno(String nombre, String primerApellido, String telefono) {
		super(nombre, primerApellido, telefono);
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", primerApellido=" + primerApellido + ", telefono=" + telefono
				+ ", asignatura=" + Arrays.toString(asignatura) + "]";
	}
	
	@Override
	public void hacerExamen () {
		System.out.println("Soy alumno y hago examenes para suspender");
	}
	
}
