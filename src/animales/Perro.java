package animales;

public class Perro extends Animales{

	public Perro(String nombre, String id) {
		super(nombre, id);
	}

	@Override
	public String toString() {
		return "Perro [toString()=" + super.toString() + "]";
	}
	
}
