package clases;

public class Asignaturas {
	
	protected String nombre;
	protected int horas;
	
	//CONSTRUCTORS
	public Asignaturas () {}
	
	public Asignaturas(String nombre, int horas) {
		super();
		this.nombre = nombre;
		this.horas = horas;
	}
	
	//SET AND GETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return "Asignaturas [nombre=" + nombre + ", horas=" + horas + "]";
	}
	
}
