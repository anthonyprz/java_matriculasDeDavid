package com.zubiri.matriculas;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Matricula extends Asignatura {
	
	int añoMatriculacion;
    double precio;
    
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
  		this.setAñoMatriculacion(sc.nextInt());
  		try{
  			System.out.println("En que departamento se aloja?");
  		this.setPrecio(sc.nextDouble());
  			
  		}catch(InputMismatchException e){
  			System.out.println("Eso no es un número ");
  			sc.nextLine();
 			
  		}
  		}
  	
  	
  	public String formattedMatricula() {
		String asignatura =
				super.formattedAsignatura() +
				"\nAño Matriculacion\t" + this.getAñoMatriculacion()
				+ "\nPrecio:\t" + this.getPrecio();
				
				return asignatura;
	}
    

	
	public int getAñoMatriculacion() {
		return añoMatriculacion;
	}
	
	public void setAñoMatriculacion(int añoMatriculacion) {
		this.añoMatriculacion = añoMatriculacion;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
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
