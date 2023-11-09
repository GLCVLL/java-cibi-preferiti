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
	}

}
