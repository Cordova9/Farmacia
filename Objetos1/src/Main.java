
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente p1 = new Cliente("Maria ", "Perez");

		Prod_medicamentos m1 = new Prod_medicamentos("paracetamol ", 1);
		// p1.Imprimir();
		// m1.Imprimir();
		Venta v1 = new Venta(1, "12/06/19", p1);
		v1.Imprimir();
		Venta v2 = new Venta(2, "15/07/19", p1);
		v2.Imprimir();
		
	}

}
