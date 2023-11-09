package org.lessons.java.array;

public class CibiPreferiti {
	
	public static void main(String[] args) {
		String[] classificaCibi ={
	            "Pizza",
	            "Sushi",
	            "Lasagne",
	            "Gelato",
	            "Burger",
	            "Pasta",

		};
		
        // Lunghezza della classifica
        int lunghezzaClassifica = classificaCibi.length;
        System.out.println("Lunghezza della classifica: " + lunghezzaClassifica);

        // Il cibo top (prima posizione della classifica)
        String ciboTop = classificaCibi[0];
        System.out.println("Il tuo cibo top: " + ciboTop);

        // Il cibo preferito ma non troppo (ultima posizione della classifica)
        String ciboNonTroppoPreferito = classificaCibi[lunghezzaClassifica - 1];
        System.out.println("Il tuo cibo preferito ma non troppo: " + ciboNonTroppoPreferito);
        
        // Gestione della posizione mediana
        if (classificaCibi.length % 2 == 0) {
            // Se la dimensione dell'array è pari, non c'è una posizione mediana
            System.out.println("Non c'è una posizione mediana.");
        } else {
            // Se la dimensione dell'array è dispari, stampa il cibo in posizione centrale
            int posizioneMediana = classificaCibi.length / 2;
            System.out.println("Cibo di mezza classifica: " + classificaCibi[posizioneMediana]);
        }
	}

}
