public class Notas {
    private float trabalho1;
    private float trabalho2;
    private float trabalho3;
    private float trabalho4;
    private float prova1;
    private float prova2;

    public Notas(float trabalho1, float trabalho2, float trabalho3, float trabalho4, float prova1, float prova2) {
        this.trabalho1 = trabalho1;
        this.trabalho2 = trabalho2;
        this.trabalho3 = trabalho3;
        this.trabalho4 = trabalho4;
        this.prova1 = prova1;
        this.prova2 = prova2;
    }
    Notas() {
        this.trabalho1 = 0;
        this.trabalho2 = 0;
        this.trabalho3 = 0;
        this.trabalho4 = 0;
        this.prova1 = 0;
        this.prova2 = 0;
    }
    public float getTrabalho1() {
        return trabalho1;
    }
    public void setTrabalho1(float trabalho1) {
        this.trabalho1 = trabalho1;
    }
    public float getTrabalho2() {
        return trabalho2;
    }
    public void setTrabalho2(float trabalho2) {
        this.trabalho2 = trabalho2;
    }
    public float getTrabalho3() {
        return trabalho3;
    }
    public void setTrabalho3(float trabalho3) {
        this.trabalho3 = trabalho3;
    }
    public float getTrabalho4() {
        return trabalho4;
    }
    public void setTrabalho4(float trabalho4) {
        this.trabalho4 = trabalho4;
    }
    public float getProva1() {
        return prova1;
    }
    public void setProva1(float prova1) {
        this.prova1 = prova1;
    }
    public float getProva2() {
        return prova2;
    }
    public void setProva2(float prova2) {
        this.prova2 = prova2;
    }
    public float mediaFinal() {
        return  (((trabalho1 + trabalho2 + prova1)/3) + ((trabalho3 + trabalho4 + prova2)/3)/2);
    }
    public String aprovado() {
        if (mediaFinal() >= 6) {
            return "\nAprovado";
        } else {
            return "\nReprovado";
        }
    }

}
