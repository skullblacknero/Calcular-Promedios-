/* Este codigo ha sido generado por el modulo psexport 20180802-mac de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SIN_TITULO.java."

import java.io.*;

public class sin_titulo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int n1;
		int n2;
		int n3;
		double prom;
		System.out.println("Ingrese calificacion 01:");
		n1 = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese calificacion 02:");
		n2 = Integer.parseInt(bufEntrada.readLine());
		System.out.println(" Ingres claificacion 03");
		n3 = Integer.parseInt(bufEntrada.readLine());
		prom = (n1+n2+n3)/3;
		if (prom>=6) {
			System.out.println("APROBADO:"+prom);
			System.out.println("Gonzalez Piñon Oscar Zair 526 N:L 17");
		} else {
			System.out.println(" NO APROBADO:"+prom);
			System.out.println("Gonzalez Piñon Oscar Zair 526 N:L 17");
		}
	}


}

