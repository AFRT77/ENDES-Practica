package Class;

public class Parejas {

	// ATRIBUTOS
	private int IDPareja;
	private String Ciudad;
	private Persona Persona1, Persona2;

	

	// CONSTRUCTOR
	public Parejas(int IDPareja, String Ciudad, Persona Persona1, Persona Persona2) {
		this.IDPareja = IDPareja;
		this.Ciudad = Ciudad;
		this.Persona1 = Persona1;
		this.Persona2 = Persona2;
	}

	// GETTER Y SETTER IDPAREJA
	public int getIDPareja() {
		return IDPareja;
	}

	public void setIDPareja(int IDPareja) {
		this.IDPareja = IDPareja;
	}

	// GETTER Y SETTER CIUDAD
	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String Ciudad) {
		this.Ciudad = Ciudad;
	}

	// METODO VALIDAR LA EDAD
	public boolean EdadValida() {
		if (Persona1.getEdad() >= 18 && Persona2.getEdad() >= 18) {
			return true;
		} else {
			return false;
		}
	}

	// METODO RESUMEN PAREJA
	public String resumenPareja() {
		return "Pareja " + IDPareja + " representando a la ciudad de " + Ciudad + "\nMiembro 1: "
				+ Persona1.getNombrePer() + " - Edad: " + Persona1.getEdad() + "\nMiembro 2: " + Persona2.getNombrePer()
				+ " - Edad: " + Persona2.getEdad();
	}

}
