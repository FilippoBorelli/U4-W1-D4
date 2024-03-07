package es_2;
abstract class Dipendente {
    private String matricola;
    private String dipartimento;
    public Dipendente(String matricola, String dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
    }
    public String getMatricola() {
        return matricola;
    }
    public String getDipartimento() {
        return dipartimento;
    }
    public abstract double calculateSalary();
}