public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("João");
        aluno.setCpf("123.456.789-00");
        aluno.setIdade(20);
        aluno.setCurso("Ciência da Computação");
        aluno.setDisciplina("Programação Orientada a Objetos");
        System.out.println("aluno 1: \n" +aluno.toString());

        Aluno aluno2 = new Aluno("Marcos", "987.654.321-00", 31, "Ciência da Computação", "Computação Gráfica");
        System.out.println("\nAluno 2: \n" +aluno2.toString());

    }
}