import java.util.List;

public class PaisTeste {
    public static void main(String[] args) {
        Pais brasil = new Pais("Brasil", "Brasília", 8515767);
        Pais argentina = new Pais("Argentina", "Buenos Aires", 2780400);
        Pais uruguai = new Pais("Uruguai", "Montevidéu", 176215);
        Pais paraguai = new Pais("Paraguai", "Assunção", 406752);

        brasil.defineFronteira(argentina);
        brasil.defineFronteira(uruguai);
        brasil.defineFronteira(paraguai);

        List<Pais> fronteirasBrasil = brasil.getFronteiras();
        System.out.println("Fronteiras do Brasil:");
        for (Pais pais : fronteirasBrasil) {
            System.out.println(pais.getNome());
        }

        List<Pais> vizinhosComunsBrasilArgentina = brasil.vizinhosComuns(argentina);
        System.out.println("Vizinhos comuns entre Brasil e Argentina:");
        for (Pais pais : vizinhosComunsBrasilArgentina) {
            System.out.println(pais.getNome());
        }
    }
}

