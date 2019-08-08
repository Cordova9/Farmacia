import java.util.ArrayList;
import java.util.List;

public class Venta {

	String fecha;
	Cliente cliente;
	// Prod_medicamentos medicamento;
	List<Prod_medicamentos> lista_medicamentos = new ArrayList<Prod_medicamentos>();
	double monto_total;
	int codigo_boleta;

	Venta() {
		this.fecha = "0/0/0";
		cliente = new Cliente();
		// medicamento = new Prod_medicamentos();

		this.monto_total = 0.0;
		this.codigo_boleta = 0;
	}

	Venta(int codigo_boleta, String fecha, Cliente cliente) {
		this.codigo_boleta = codigo_boleta;
		this.fecha = fecha;
		this.cliente = cliente;
		// this.medicamento = medicamento;
		Prod_medicamentos m1 = new Prod_medicamentos("paracetamol ", 1);
		Prod_medicamentos m2 = new Prod_medicamentos("paracetamol ", 1);
		Prod_medicamentos m3 = new Prod_medicamentos("paracetamol ", 1);

		lista_medicamentos.add(m1);
		lista_medicamentos.add(m2);
		lista_medicamentos.add(m3);
		lista_medicamentos.add(m1);

		this.monto_total =Calcular_Total();

	}

	double Calcular_Total() {
		double suma=0;
		for (int i = 0; i < lista_medicamentos.size(); i++) {
		suma=suma+lista_medicamentos.get(i).precio;	
		}
		
	return suma;
	}
	

	void Imprimir() {
		System.out.println("Boleta :" + codigo_boleta);
		System.out.println("Fecha: " + fecha);
		cliente.Imprimir();
		// medicamento.Imprimir();
		for (int i = 0; i < lista_medicamentos.size(); i++) {
			lista_medicamentos.get(i).Imprimir();//clases y objetos
			}
		System.out.println(monto_total);
	}

	
	
}
