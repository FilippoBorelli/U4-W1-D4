package es_3;
public class Dipendente implements CheckIn {
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
    @Override
    public void checkIn() {
        System.out.println("Il dipendente con matricola " + matricola + " inizia il turno di lavoro.");
    }
}