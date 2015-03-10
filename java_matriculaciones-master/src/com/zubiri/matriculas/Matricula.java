package com.zubiri.matriculas;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Matricula extends Asignatura {
	
	static int añoMatriculacion;
    static double precio;
    
    Scanner sc = new Scanner(System.in);
        	
  	public Matricula (Scanner sc){
  		super(sc);
  		try{
  		System.out.println("cual es el año de matriculacion ?:");
  		
  			this.setAñoMatriculacion(sc.nextInt());
  		}catch(InputMismatchException e){
		System.out.println("Eso no es un número ");
		sc.nextLine();
  			
  		}
  		//this.setAñoMatriculacion(sc.nextInt());
  		try{
  			System.out.println("cual es el precio?");
  		this.setPrecio(sc.nextDouble());
  			
  		}catch(InputMismatchException e){
  			System.out.println("Eso no es un número ");
  			sc.nextLine();
 			
  		}
  		}
  	
  	
 

	
	public static int getAñoMatriculacion() {
		return añoMatriculacion;
	}
	
	public void setAñoMatriculacion(int añoMatriculacion) {
		this.añoMatriculacion = añoMatriculacion;
	}
	
	public static double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public static String formattedMatricula() {
		String asignatura =
				formattedAsignatura() +
				"\nAño Matriculacion\t" + getAñoMatriculacion()
				+ "\nPrecio:\t" + getPrecio();
				
				return asignatura;
	}
    
    
	
	/**
	 * M�todo que calcula un descuento basado en porcentaje sobre el precio original
	 * de la matr�cula.
	 * @return
	 */
	public void  descuentoFamiliaNumerosa(int porcentaje) {
		try{
			System.out.println("De cuanto es el descuento?");
		porcentaje = sc.nextInt();}
		catch(InputMismatchException e){
  			System.out.println("Eso no es un número ");
  			sc.nextLine();
 			
  		}
				
		System.out.println("entonces el descuento final  sera de :" + (getPrecio()*porcentaje) / 100 );
		double descuento = (getPrecio()*porcentaje) / 100 ;
		
	}
	
}
