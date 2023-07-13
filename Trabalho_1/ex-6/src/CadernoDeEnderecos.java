import javax.xml.crypto.Data;

public class CadernoDeEnderecos {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String dataDeNascimento;

    public CadernoDeEnderecos(String nome, String endereco, String telefone, String email, String dataDeNascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
    }
    CadernoDeEnderecos() {
        this.nome = "";
        this.endereco = "";
        this.telefone = "";
        this.email = "";
        this.dataDeNascimento = dataDeNascimento;}
    public String getNome() {
        return this.nome;
    }
    public String getEndereco() {
        return this.endereco;
    }
    public String getTelefone() {
        return this.telefone;
    }
    public String getEmail() {
        return this.email;
    }
    public String getDataDeNascimento() {
        return this.dataDeNascimento;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    public String toString() {
        return "Nome: " + this.nome + "\nEndereço: " + this.endereco + "\nTelefone: " + this.telefone + "\nEmail: " + this.email + "\nData de Nascimento: " + this.dataDeNascimento;
    }

}
