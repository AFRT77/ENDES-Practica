package Main;

import Class.Ciudad;
import Class.Parejas;
import Class.Persona;

public class MainCampeonato {

	public static void main(String[] args) {
		
		//Esto es para la practica de entornos
		//AÑADIMOS LAS PERSONJAS Y PAREJAS
		Persona persona1Pareja1 = new Persona("Amin", 30);
        Persona persona2Pareja1 = new Persona("Dama", 32);

        Persona persona1Pareja2 = new Persona("Adrian", 30);
        Persona persona2Pareja2 = new Persona("Helena", 16);
        
        //AÑADIMOS CIUDAD DEL CAMPEONATO
        Ciudad Ciudad1 = new Ciudad ("Ciudad Real", "Paseo de la Universidad");

        //AÑADIMOS LAS PAREJAS
        Parejas pareja1 = new Parejas(1, "Toledo", persona1Pareja1, persona2Pareja1);
        Parejas pareja2 = new Parejas(2, "Albacete", persona1Pareja2, persona2Pareja2);

        //IMPRIMIMOS LOS DATOS 
        System.out.println("El campeonato se celebra en " + Ciudad1.getNombreCiu() + " en la calle " + Ciudad1.getCalle());
        System.out.println("Parejas inscritas:\n" + pareja1.resumenPareja() + " \n " + pareja2.resumenPareja());

        System.out.println("¿La pareja 1 es válida? " + pareja1.EdadValida());
        System.out.println("¿La pareja 2 es válida? " + pareja2.EdadValida());
		

	}

}
