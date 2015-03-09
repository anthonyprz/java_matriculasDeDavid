package com.zubiri.matriculas;

import java.util.Scanner;

public class Asignatura {

	String nombre;
	int creditos;
	Profesor profesor;
	
	
	
public Asignatura (Scanner sc){
  		
  		System.out.println("Nombre de la asignatura ?:");
  		this.setNombre(sc.next());
  		System.out.println("Cuantos Creditos?");
  		this.setCreditos(sc.nextInt());
  		this.setProfesor(new Profesor(sc));
  			
  		}
  	
  	//contructor 2º
  public Asignatura (String nombre, int creditos,Profesor profesor) {
  		
  		this.nombre = nombre;
  		this.creditos = creditos;
  		this.profesor = profesor;
  		
  	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCreditos() {
		return creditos;
	}
	
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	public Profesor getProfesor() {
		return profesor;
	}
	
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	/**
	 * M�todo que retorna un String con los valores de las propiedades
	 * formateados del siguiente modo:
	 *  <NOMBRE_PROPIEDAD1> : <VALOR_PROPIEDAD1>\n
	 *  <NOMBRE_PROPIEDAD2> : <VALOR_PROPIEDAD2>\n 
	 *  .....
	 * @return String
	 */
	
	public String formattedAsignatura() {
		String asignatura =
				"\nNombre de la asignatura\t" + this.getNombre()
				+ "\nCreditos:\t" + this.getCreditos()
				 + "\nProfesor:\t" + this.getProfesor()
				 + "\nCreditos:\t" + this.getCreditos()
				 ;
				
				return asignatura;
	}
	
	/**
	 * M�todo que obtiene valores de una asignatura a partir de un String y 
	 * un caracter separador.
	 */
	public void split(String asignaturaStr, String separator) {
		String[] strArray = asignaturaStr.split(separator);
		this.setNombre(strArray[0]);
		//this.setCreditos(strArray[1]);
		this.setProfesor(new Profesor(strArray[1],";"));
	}

}
