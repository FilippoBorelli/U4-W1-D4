package es_2;
class DipendentePartTime extends Dipendente {
    private int oreLavorate;
    private double stipendioOrario;
    public DipendentePartTime(String matricola, String dipartimento, int oreLavorate, double stipendioOrario) {
        super(matricola, dipartimento);
        this.oreLavorate = oreLavorate;
        this.stipendioOrario = stipendioOrario;
    }
    @Override
    public double calculateSalary() {
        return oreLavorate * stipendioOrario;
    }
}

