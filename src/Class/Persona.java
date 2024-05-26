package Class;

public class Persona {

	// ATRIBUTOS
	private String NombrePer;
	private int Edad;

	// CONSTRUCTOR
	public Persona(String NombrePer, int Edad) {
		this.NombrePer = NombrePer;
		this.Edad = Edad;
	}

	// GETTER Y SETTER NOMBREPER
	public String getNombrePer() {
		return NombrePer;
	}

	public void setNombrePer(String NombrePer) {
		this.NombrePer = NombrePer;
	}

	// GETTER Y SETTER EDAD
	public int getEdad() {
		return Edad;
	}

	public void setEdad(int Edad) {
		this.Edad = Edad;
	}

}
