package animales;

public class Animales {
	private String nombre;
	private String id;
	
	public Animales(String nombre, String id) {
		super();
		this.nombre = nombre;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Animales [nombre=" + nombre + ", id=" + id + "]";
	}
	
	
}
