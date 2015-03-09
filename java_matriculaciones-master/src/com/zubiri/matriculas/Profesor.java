package com.zubiri.matriculas;

import java.util.Scanner;

public class Profesor extends Persona {
	
	String titulacion;
	String departamento;
	
	//Constructor 1º
	
	public Profesor (Scanner sc){
		
		System.out.println("cual es la titulacion ?:");
		this.setTitulacion(sc.next());
		System.out.println("En que departamento se aloja?");
		this.setDepartamento(sc.next());
		
			
		}
	
	//contructor 2º
public Profesor(String titulacion, String departamento) {
		
		this.titulacion = titulacion;
		this.departamento = departamento;
		
	}
	
public String formattedProfesor() {
	String profesor =
			super.formattedPersona() +
			"\nAño de inscripcion::\t" + this.getTitulacion()
			+ "\nNombre del ciclo:\t" + this.getDepartamento();
			
			return profesor;
}




	public String getTitulacion() {
		return titulacion;
	}
	
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
