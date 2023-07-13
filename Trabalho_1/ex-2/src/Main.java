public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", "123456789-00", 20, "Ciência da Computação", new Disciplina("Programação Orientada a Objetos", 64));
        System.out.println(aluno.toString());
    }
}