package clases;

import java.util.Arrays;

public abstract class Personas {

	protected String nombre;
	protected String primerApellido;
	protected String telefono;
	protected Asignaturas [] asignatura;
	
	//CONSTRUCTORS
	public Personas () {
		
	}
	
	public Personas(String nombre, String primerApellido, String telefono) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.telefono = telefono;
	}
	
	public Personas(String nombre, String primerApellido, String telefono, Asignaturas [] asignatura) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.telefono = telefono;
		this.asignatura = asignatura;
	}
	
	//SET AND GETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Asignaturas[] getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignaturas[] asignatura) {
		this.asignatura = asignatura;
	}

	@Override
	public String toString() {
		return "Personas [nombre=" + nombre + ", primerApellido=" + primerApellido + ", telefono=" + telefono
				+ ", asignatura=" + Arrays.toString(asignatura) + "]";
	}
	
	public void irAClase () {
		System.out.println("Salgo de casa");
		System.out.println("Cojo mi transporte");
		System.out.println("Llego a clase");
	}
	
	public abstract void hacerExamen ();
}
