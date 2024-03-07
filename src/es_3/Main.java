package es_3;
public class Main {
    public static void main(String[] args) {
        CheckIn[] dipendentiEVolontari = new CheckIn[] {
                new Dipendente("001", "Produzione"),
                new Volontario("Marco", 25, "Esperienza nel sociale"),
                new Dipendente("002", "Vendite"),
                new Volontario("Anna", 30, "Assistenza agli anziani"),
                new Dipendente("003", "Amministrazione")
        };
        for (CheckIn persona : dipendentiEVolontari) {
            persona.checkIn();
        }
    }
}
