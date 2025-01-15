package clases;

import java.util.Arrays;

public class Profesor extends Personas {
	
	protected String iban;
	
	//CONSTRUCTORS
	public Profesor () {
		super();
	}

	public Profesor(String nombre, String primerApellido, String telefono, Asignaturas[] asignatura, String iban) {
		super(nombre, primerApellido, telefono, asignatura);
		this.iban = iban;
	}

	public Profesor(String nombre, String primerApellido, String telefono, String iban) {
		super(nombre, primerApellido, telefono);
		this.iban = iban;
	}
	
	//SET AND GETTERS
	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	@Override
	public String toString() {
		return "Profesor [iban=" + iban + ", nombre=" + nombre + ", primerApellido=" + primerApellido + ", telefono="
				+ telefono + ", asignatura=" + Arrays.toString(asignatura) + "]";
	}
	
	@Override
	public void irAClase() {
		System.out.println("Yo soy profesor y voy en coche");
	}
	
	@Override
	public void hacerExamen() {
		System.out.println("Soy profesor y creo el examen de cabron");
	}
}
