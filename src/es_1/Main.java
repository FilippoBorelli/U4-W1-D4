package es_1;

public class Main {
    public static void main(String[] args) {
        Dipendente dipendenti[] = new Dipendente[3];

        // Istanzia 3 dipendenti
        dipendenti[0] = new Dipendente("001", 2500.0, "PRODUZIONE");
        dipendenti[1] = new Dipendente("002", 2800.0, "AMMINISTRAZIONE");
        dipendenti[2] = new Dipendente("003", 3000.0, "VENDITE");

        // Itera sugli dipendenti e stampa la matricola di ognuno
        for (Dipendente dipendente : dipendenti) {
            System.out.println("Matricola: " + dipendente.getMatricola());
        }
    }
}
