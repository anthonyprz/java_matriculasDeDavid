package com.zubiri.matriculas;
import java.util.ArrayList;
import java.util.Scanner;
public class Matriculas {

 
	ArrayList<Alumno> alumno =new  ArrayList<Alumno>();

public void createAlumno(Scanner sc) {
	//	Alumno alumn = new Alumno();
		System.out.println("vamos a crear un alumno?");
		System.out.println("--------------------------");
		alumno.add(new Alumno(sc));
		System.out.println("Visualizacion del Alumno:");
		System.out.println(Alumno.formattedAlumno());
		}

public void createProfesor(Scanner sc){
	
	//Profesor profe = new Profesor(sc);
	System.out.println("vamos a crear un Profe");
	System.out.println("--------------------------");
	new Profesor(sc);
	System.out.println("Visualizacion del Profesor:");
	System.out.println(Profesor.formattedProfesor());
	}




public void createMatriculas(Scanner sc) {
		//Matricula matricula = new Matricula(sc);
		System.out.println("vamos a crear una matricula?");
		System.out.println("--------------------------");
		new Matricula(sc);
		System.out.println("Visualizacion de la matricula:");
		System.out.println(Matricula.formattedMatricula());		
		}

}

