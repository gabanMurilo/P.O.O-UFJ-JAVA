public class Disciplina {
    private String disciplina;
    private int cargaHoraria;

    public Disciplina(String disciplina, int cargaHoraria) {
        this.disciplina = disciplina;
        this.cargaHoraria = cargaHoraria;
    }
    Disciplina() {
        this.disciplina = "";
        this.cargaHoraria = 0;
    }
    public String getDisciplina() {
        return this.disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public int getCargaHoraria() {
        return this.cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String toString() {
        return "Disciplina: %s\nCarga Horária: %d\n".formatted(getDisciplina(), getCargaHoraria());
    }

}
