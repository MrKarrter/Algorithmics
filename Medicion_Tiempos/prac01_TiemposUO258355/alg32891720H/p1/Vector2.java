package alg77777777.p1 ;


/** Esta clase utiliza los m�todos est�ticos de Vector1.
 *  Realiza la medici�n de tiempos de la operacion de suma
 **/
public class Vector2
{
	static int []v;

	public static void main (String arg [] )
	{
		int n= Integer.parseInt (arg[0]);  //tama�o del problema leido de l�nea de comandos
		v = new int [n] ;
		Vector1.rellena (v);

		// Declara variables de tipo long para recoger el datos de milisegundos
		long t1,t2;

		t1=System.currentTimeMillis();	// milisegundos actuales antes del c�digo a medir
		int s=Vector1.suma (v);
		t2=System.currentTimeMillis();	// milisegundos actuales despu�s del c�digo a medir
		System.out.println ("Tama�o del problema = "+n+"\t"+"Tiempo m�todo suma = "+(t2-t1));

		System.out.println ("Resultado de la suma de elementos = "+ s);
	} // fin de main

} // fin de clase