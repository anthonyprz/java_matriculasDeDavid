package com.zubiri.matriculas;
import java.util.Scanner;


public abstract class Persona {
	
	static String dni;
	static String nombre;
	static String apellido;
	
	public Persona (){}
	
	public Persona(String dni, String nombre, String apellido) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Persona (Scanner sc){
	
	System.out.println("Introduce el Dni:");
	this.setDni(sc.next());
	System.out.println("Introduce el Nombre:");
	this.setNombre(sc.next());
	System.out.println("Introduce el Apellido:");
	this.setApellido(sc.next());
		
	}
	public static String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public static String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public  static String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	/**
	 * M�todo que retorna un String con los valores de las propiedades
	 * formateados del siguiente modo:
	 *  <NOMBRE_PROPIEDAD1> : <VALOR_PROPIEDAD1>\n
	 *  <NOMBRE_PROPIEDAD2> : <VALOR_PROPIEDAD2>\n 
	 *  .....
	 * @return String
	 */
	
	public static String formattedPersona() {
		String persona =
				"\nDNI:\t" + getDni()
				+ "\nNombre:\t" + getNombre()
				 + "\nApellido:\t" + getApellido();
				
				return persona;
	}
	
	/**
	 * M�todo que obtiene valores de una persona a partir de un String y 
	 * un caracter separador.
	 */
	public void split(String personaStr, String separator) {
		
		String[] strArray = personaStr.split(separator);
		this.setDni(strArray[0]);
		this.setNombre(strArray[1]);
		this.setApellido(strArray[2]);
	}
}
