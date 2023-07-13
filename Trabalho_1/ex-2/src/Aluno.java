import java.util.ArrayList;
import java.util.Arrays;

public class Aluno extends Pessoa{

    //atributos
    private String curso;
    private Disciplina[] disciplinas;

    //getters e setters
    public String getCurso() {
        return this.curso;
    }
     public void setCurso(String curso) {
        this.curso = curso;
    }
    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(Disciplina disciplina) {
        this.disciplinas= new Disciplina[]{disciplina};
    }
    public void addDisciplina(Disciplina disciplina) {
        ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>(Arrays.asList(this.disciplinas));
        disciplinas.add(disciplina);
        this.disciplinas = disciplinas.toArray(new Disciplina[disciplinas.size()]);
    }


    //construtores
    Aluno(String nome, String cpf, int idade, String curso, Disciplina disciplinas) {
        super(nome, cpf, idade);
        this.curso = curso;
        this.disciplinas = new Disciplina[]{disciplinas};
    }
    Aluno() {
        this("Sem nome", "Sem CPF", 0, "Sem curso", new Disciplina());
    }


    public String toString() {
        return "Nome: %s\nIdade: %d\nCPF: %s\nCurso: %s\nDisciplinas: %s\n".formatted(getNome(), getIdade(), getCpf(), getCurso(), Arrays.toString(getDisciplinas()));
    }
}
