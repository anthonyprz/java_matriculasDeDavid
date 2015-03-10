package com.zubiri.matriculas;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Alumno extends Persona {
	
	
	ArrayList<Matricula> matriculas = null;
	static int añoInscripcion = -1;
	//Ciclo que cursa el alumno
	static String ciclo = null;
	
	
	
	public Alumno (){}
	
	public Alumno(String dni, String nombre, String apellido, int añoInscripcion, String ciclo) {
	
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.añoInscripcion = añoInscripcion;
		this.ciclo = ciclo;
		
	}
	public  Alumno(Scanner sc){
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
	public static String formattedAlumno() {
		String alumno =
				formattedPersona() +
				"\nAño de inscripcion::\t" + getAñoInscripcion()
				+ "\nNombre del ciclo:\t" + getCiclo();
				
				return alumno;
	}

	public static int getAñoInscripcion(){
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
	
	public static String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

}
