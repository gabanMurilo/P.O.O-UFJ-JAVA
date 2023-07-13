import javax.xml.crypto.Data;
import java.util.Date;

public class CadernoDeEnderecosTeste {
    public static void main(String[] args) {
        CadernoDeEnderecos cadernoDeEnderecos = new CadernoDeEnderecos("João", "Rua 1", "123456789", "jao@gmail.com", "01/01/2000");
        System.out.println(cadernoDeEnderecos.toString());

        CadernoDeEnderecos pessoa = new CadernoDeEnderecos();
        pessoa.setNome("Marcos");
        pessoa.setEndereco("Rua 15");
        pessoa.setTelefone("987654321");
        pessoa.setEmail("mw@gmail.com");
        pessoa.setDataDeNascimento("10/01/1990");
        System.out.println(pessoa.toString());

    }

}