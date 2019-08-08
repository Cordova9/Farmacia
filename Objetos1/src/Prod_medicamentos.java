
public class Prod_medicamentos {
	String nombre;
	double precio;

	Prod_medicamentos() {
		this.nombre = "No existe";
		this.precio = 0;
	}

	public Prod_medicamentos(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	void Imprimir() {
		System.out.println(nombre+" cuesta: "+precio);
	}
}
