package com.zubiri.matriculas;
import java.util.ArrayList;
import java.util.Scanner;
public class MainAnthony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Matriculas matricula = new Matriculas();

		 int opcionMain;
		 System.out.println("¿quieres hacer");
		 System.out.println("crear alumnos ------1");
		 System.out.println("crear profesor------2");
		 System.out.println("crear matricula-----3");
		 System.out.println("salir del programa--4");
		 
		 opcionMain = sc.nextInt();
		 switch (opcionMain) {
		 case 1:
			 matricula.createAlumno(sc);
			 break;
		 case 2:
			 matricula.createProfesor(sc);
			 break;
		 case 3:
			 matricula.createMatriculas(sc);
			break;
		 case 4:
			 System.out.println("gracias por usar el programa");
			break;
		 }
		 while(opcionMain != 0);
		 
		 
	}

}
