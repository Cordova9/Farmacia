
public class FabricaAutos {
	String color;
	String marca;
	
	public FabricaAutos(String color, String marca) {
		this.color = color;
		this.marca = marca;
	}
	
	public FabricaAutos() {
		color = "Blanco";
		marca = "Toyota";
	}
	void imprimir() {
		System.out.println("El color es: "+ color);
		System.out.println("La marca es: "+ marca);
	}
	
	void acelerar() {
		
	}
	
	void frenar() {
		
	}
}
