
public class Persona {
	String nombre;
	String apellido;
	FabricaAutos[] misautos = new FabricaAutos[3];
	
	Persona(String nombre, String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
		misautos[0]=new FabricaAutos();
		misautos[1]=new FabricaAutos("verde","Audi");
		misautos[2]=new FabricaAutos();
	}

	Persona() {
		this.nombre="no tiene";
		this.apellido="no tiene";
		misautos[0]=new FabricaAutos();
		misautos[1]=new FabricaAutos();
		misautos[2]=new FabricaAutos();
	}
	
	public void imprimir(){
		System.out.println(nombre+" -|- "+apellido);
		for (int i = 0; i < misautos.length; i++) {
			misautos[i].imprimir();
		}
	}
}
