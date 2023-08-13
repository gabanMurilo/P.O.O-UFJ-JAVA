public class Cardapio {
    //atributos
    private String arroz;
    private String feijao;
    private String carne;
    private String vegetariano;
    private String guarnicao;
    private String folhas;
    private String legumes;
    private String fruta;
    private String suco;

    //Construtor
    public Cardapio(String arroz, String feijao, String carne, String vegetariano, String guarnicao, String folhas, String legumes, String fruta, String suco) {
        this.arroz = arroz;
        this.feijao = feijao;
        this.carne = carne;
        this.vegetariano = vegetariano;
        this.guarnicao = guarnicao;
        this.folhas = folhas;
        this.legumes = legumes;
        this.fruta = fruta;
        this.suco = suco;
    }

    //Getters e Setters
    public String getArroz() {return arroz;}
    public void setArroz(String arroz) {
        this.arroz = arroz;
    }
    public String getFeijao() {
        return feijao;
    }
    public void setFeijao(String feijao) {
        this.feijao = feijao;
    }
    public String getCarne() {
        return carne;
    }
    public void setCarne(String carne) {
        this.carne = carne;
    }
    public String getVegetariano() {
        return vegetariano;
    }
    public void setVegetariano(String vegetariano) {
        this.vegetariano = vegetariano;
    }
    public String getGuarnicao() {
        return guarnicao;
    }
    public void setGuarnicao(String guarnicao) {
        this.guarnicao = guarnicao;
    }
    public String getFolhas() {
        return folhas;
    }
    public void setFolhas(String folhas) {
        this.folhas = folhas;
    }
    public String getLegumes() {
        return legumes;
    }
    public void setLegumes(String legumes) {
        this.legumes = legumes;
    }
    public String getFruta() {
        return fruta;
    }
    public void setFruta(String fruta) {
        this.fruta = fruta;
    }
    public String getSuco() {
        return suco;
    }
    public void setSuco(String suco) {
        this.suco = suco;
    }


}
