package com.zubiri.matriculas;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class Alumno extends Persona {
	
	
	ArrayList<Matricula> matriculas = null;
	int añoInscripcion = -1;
	//Ciclo que cursa el alumno
	String ciclo = null;
	
	
	
	public Alumno (){}
	
	public Alumno(int añoInscripcion, String ciclo) {
		
		this.añoInscripcion = añoInscripcion;
		this.ciclo = ciclo;
		
	}
	public Alumno(Scanner sc){
	super(sc);
	try{	System.out.println("Introduce el ano de inscripcion:");
	this.setAñoInscripcion(sc.nextInt());}
	catch(InputMismatchException e){
			System.out.println("Eso no es un número ");
			sc.nextLine();
			
		}

	System.out.println("Introduce el Nombre del ciclo:");
	this.setCiclo(sc.next());
	

	}
	

	
	//creado Por Mi
	public String formattedAlumno() {
		String alumno =
				super.formattedPersona() +
				"\nAño de inscripcion::\t" + this.getAñoInscripcion()
				+ "\nNombre del ciclo:\t" + this.getCiclo();
				
				return alumno;
	}

	public int getAñoInscripcion(){
		return añoInscripcion;
	}
	
	public void setAñoInscripcion(int añoInscripcion) {
		this.añoInscripcion = añoInscripcion;
	}
	
	public ArrayList<Matricula> getMatriculas() {
		return matriculas;
	}
	
	public void setMatriculas(ArrayList<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	
	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

}
