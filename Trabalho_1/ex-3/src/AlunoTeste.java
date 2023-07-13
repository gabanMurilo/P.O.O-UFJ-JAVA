public class AlunoTeste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Disciplina poo =new Disciplina("Programação Orientada a Objetos", 64);
        Disciplina ed2 =new Disciplina("Estrutura de Dados 2", 64);
        Disciplina ed1 =new Disciplina("Estrutura de Dados 1", 64);

        aluno.setNome("João");
        aluno.setCpf("123.456.789-00");
        aluno.setIdade(20);
        aluno.setCurso("Ciência da Computação");
        aluno.setDisciplinas(poo);
        aluno.addDisciplina(ed2);
        aluno.addDisciplina(ed1);
        System.out.println("aluno 1: \n" +aluno.toString());


        Aluno aluno2 = new Aluno("Marcos", "987.654.321-00", 31, "Ciência da Computação", poo);
        System.out.println("\nAluno 2: \n" +aluno2.toString());

    }
}