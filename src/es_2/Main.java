package es_2;
public class Main {
    public static void main(String[] args) {
        Dipendente[] dipendenti = new Dipendente[] {
                new DipendenteFullTime("001", "Produzione", 2500.0),
                new DipendentePartTime("002", "Vendite", 20, 15.0),
                new Dirigente("003", "Amministrazione", 5000.0, 1000.0)
        };
        double stipendiTotali = 0.0;
        for (Dipendente dipendente : dipendenti) {
            stipendiTotali += dipendente.calculateSalary();
        }
        System.out.println("Stipendi totali: " + stipendiTotali);
    }
}
