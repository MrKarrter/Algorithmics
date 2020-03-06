package alg77777777.p1 ;


/** Esta Clase utiliza los m�todos est�ticos de la clase Vector1.
 * Sirve para medir tiempos de la operaci�n suma, para ello:
 * Va incrementando autom�ticamente el tama�o del problema y adem�s
 * seg�n una escala de tiempos determinada por nVeces, 
 * que se proporciona como argumento en l�nea de comandos para la ejecuci�n
 */
public class Vector4
{
	static int []v;

	public static void main (String arg [] )
	{
		int nVeces = Integer.parseInt (arg[0]);	// veces que se repite la operaci�n

		long t1,t2;

		System.out.println("nVeces = "+ nVeces);
		System.out.println ("Tama�o\tTiempo\tResultado");   
		for ( int n= 10; n<= 100000000 ; n*=3) // n se va incrementando *5   
		{
			v = new int [n] ;
			Vector1.rellena (v);

			t1=System.currentTimeMillis();

			int s= 0;
			// hay que repetir todo el proceso a medir (lo que que estaba entre t1 y t2) 
			for (int repeticion= 1; repeticion<=nVeces; repeticion++)
			{  	
				s= Vector1.suma (v);
			}

			t2=System.currentTimeMillis();
			System.out.println (n+"\t"+(t2-t1)+"\t"+s);   

		} // fin de for
		
		System.out.println("\nFin de la medici�n de tiempos *****");

	} // fin de main

} // fin de clase