public class Aluno extends Pessoa{
    private final String[] disciplina;
    //atributos
    private String curso;
    private Disciplina[] disciplinas;

    //getters e setters
    public String getCurso() {
        return this.curso;
    }
    public Disciplina[] getDisciplina() {
        return disciplinas;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public Disciplina getDisciplinas(int index) {
        return this.disciplinas[index];
    }

    //construtores
    Aluno(String nome, String cpf, int idade, String curso, String disciplina) {
        super(nome, cpf, idade);
        this.curso = curso;
        this.disciplina = new String[]{disciplina};
    }
    Aluno() {
        this("Sem nome", "Sem CPF", 0, "Sem curso", "Sem disciplina");
    }


    public String toString() {
        return "Nome: " + getNome() +
                "\nIdade: " + getIdade() +
                "\nCPF: " + getCpf() +
                "\nCurso: " + getCurso() +
                "\nDisciplina: " + getDisciplina();
    }
}
