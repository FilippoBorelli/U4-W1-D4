package es_1;

public class Dipendente {
    private String matricola;
    private double stipendio;
    private String dipartimento;

    // Costruttore
    public Dipendente(String matricola, double stipendio, String dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    // Getter per la matricola
    public String getMatricola() {
        return matricola;
    }

    // Getter per lo stipendio
    public double getStipendio() {
        return stipendio;
    }

    // Getter per il dipartimento
    public String getDipartimento() {
        return dipartimento;
    }

    // Setter per il dipartimento
    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    }
}