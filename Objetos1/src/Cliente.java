
public class Cliente {
	String nombre;
	String apellido;

	Cliente() {
		this.nombre = "no tiene";
		this.apellido = "no tiene";
	}

	public Cliente(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	void Imprimir() {
		System.out.println(nombre + " " + apellido);
	}
}
