package mispaquetes;

import java.io.*;
import java.util.Random;

public class EscribeFichero {
	public static void main(String[] args) {
		// Simulamos la recepción de un fichero de transferencias generándolo
		// Si hay algún error, salimos con negativos. Si todo va bien, con 0.
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("C:\\Users\\TuKuloTaRoto\\Desktop\\mitula.txt");
			pw = new PrintWriter(fichero);

			Random rnd = new Random();

			Double importeTransferencia = (double) 0;

			for (int i = 0; i < 100; i++) {
				importeTransferencia = (rnd.nextDouble() * (2000 - 500 + 1) + 500);
				importeTransferencia = Math.round(importeTransferencia * 100.0) / 100.0;
				pw.println(importeTransferencia);

			}
		} catch (Exception e) {
			System.exit(-1);
		} finally {
			try {
				// Nuevamente aprovechamos el finally para
				// asegurarnos que se cierra el fichero.
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				System.exit(-2);
			}
		}
		System.exit(0);
	}
}