abstract class Pessoa {
    //atributos
    private String nome;
    private String cpf;
    private int idade;

    //metodos
    Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    Pessoa () {
        this("Sem nome", "Sem CPF", 0);
    }

    //getters e setters
    public String getNome() {
        return this.nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

/*    public String toString() {
        return "Nome: " + this.nome + "\nCPF: " + this.cpf + "\nIdade: " + this.idade;
    }*/

}
