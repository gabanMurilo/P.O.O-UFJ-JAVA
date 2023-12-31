import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pais {
    private String nome;
    private String capital;
    private int dimensao;
    private List<Pais> fronteiras;

    public Pais(String nome, String capital, int dimensao) {
        this.nome = nome;
        this.capital = capital;
        this.dimensao = dimensao;
        this.fronteiras = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCapital() {
        return capital;
    }

    public int getDimensao() {
        return dimensao;
    }

    public boolean equals(final Pais outro) {
        return this.nome.equals(outro.nome) && this.capital.equals(outro.capital);
    }

    public void defineFronteira(Pais pais) {
        if (!this.equals(pais) && !fronteiras.contains(pais)) {
            fronteiras.add(pais);
        }
    }

    public List<Pais> getFronteiras() {
        return fronteiras;
    }

    public List<Pais> vizinhosComuns(Pais outroPais) {
        List<Pais> vizinhosComuns = new ArrayList<>();
        for (Pais pais : fronteiras) {
            if (outroPais.getFronteiras().contains(pais)) {
                vizinhosComuns.add(pais);
            }
        }
        return vizinhosComuns;
    }
}
