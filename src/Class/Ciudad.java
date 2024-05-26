package Class;

public class Ciudad {

	//Comentario en Ciudad para Entornos
	// ATRIBUTOS
	private String NombreCiu, Calle;

	// CONSTRUCTOR
	public Ciudad(String NombreCiu, String Calle) {
		this.NombreCiu = NombreCiu;
		this.Calle = Calle;
	}
	
	//GETTER Y SETTER NOMBRECIU
	public String getNombreCiu() {
		return NombreCiu;
	}

	public void setNombreCiu(String NombreCiu) {
		this.NombreCiu = NombreCiu;
	}
	
	//GETTER Y SETTER CALLE
	public String getCalle() {
		return Calle;
	}

	public void setCalle(String Calle) {
		this.Calle = Calle;
	}


}
