public class Disciplina {
    private String disciplina;
    private int cargaHoraria;
    private String professor;

    public Disciplina(String disciplina, int cargaHoraria, String professor) {
        this.disciplina = disciplina;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }
    Disciplina() {
        this.disciplina = "";
        this.cargaHoraria = 0;
        this.professor = "";
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
    public String getProfessor() {
        return this.professor;
    }
    public void setProfessor(String professor) {
        this.professor = professor;
    }
}
