import java.time.Instant;
import java.util.Date;

public  class Dia extends Cardapio{
    private String dia;
    private Date data;
    private String refeicao;
    public Dia(String arroz, String feijao, String carne, String vegetariano, String guarnicao, String folhas, String legumes, String fruta, String suco) {
        super(arroz, feijao, carne, vegetariano, guarnicao, folhas, legumes, fruta, suco);
    }
    Dia(){
        super("Arroz", "Feijão", "Carne", "Vegetariano", "Guarnição", "Folhas", "Legumes", "Fruta", "Suco");
    }
    public String getDia() {
        return dia;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }
    public Date getData() {
        return data;
    }
    public void setData(String data) {
        this.data = Date.from(Instant.now());
    }
    public String getRefeicao() {
        return refeicao;
    }
    public void setRefeicao(String refeicao) {
        this.refeicao = refeicao;
    }

    @Override
    public String toString() {
        return "Dia{" +
                "dia='" + dia + '\'' +
                ", data=" + data +
                ", refeicao='" + refeicao + '\'' +
                ", arroz='" + getArroz() + '\'' +
                ", feijao='" + getFeijao() + '\'' +
                ", carne='" + getCarne() + '\'' +
                ", vegetariano='" + getVegetariano() + '\'' +
                ", guarnicao='" + getGuarnicao() + '\'' +
                ", folhas='" + getFolhas() + '\'' +
                ", legumes='" + getLegumes() + '\'' +
                ", fruta='" + getFruta() + '\'' +
                ", suco='" + getSuco() + '\'' +
                "}";
    }
}
