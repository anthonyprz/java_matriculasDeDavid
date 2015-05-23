package com.zubiri.matriculas;

import java.util.Scanner;

public class Profesor extends Persona {
	
	static String titulacion;
	static String departamento;
	
	//Constructor 1º
	public Profesor(String titulacion, String departamento) {
		
		Profesor.titulacion = titulacion;
		Profesor.departamento = departamento;
		
	}
	//contructor 2º
	public Profesor (Scanner sc){
		super(sc);		
		System.out.println("cual es la titulacion ?:");
		this.setTitulacion(sc.next());
		System.out.println("En que departamento se aloja?");
		this.setDepartamento(sc.next());			
		}

	public static String formattedProfesor() {
		String profesor =
				formattedPersona() +
				"\nAño de inscripcion::\t" + getTitulacion()
				+ "\nNombre del ciclo:\t" + getDepartamento();
				
				return profesor;
	}

	public static String getTitulacion() {
		return titulacion;
	}
	
	public void setTitulacion(String titulacion) {
		Profesor.titulacion = titulacion;
	}
	
	public static String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		Profesor.departamento = departamento;
	}
	
}
