package es_2;
class Dirigente extends DipendenteFullTime {
    private double bonus;
    public Dirigente(String matricola, String dipartimento, double stipendioMensile, double bonus) {
        super(matricola, dipartimento, stipendioMensile);
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}

