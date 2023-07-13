import java.util.Date;

public class EntradaDeCinema {

    private Date dataDoFilme;
    private int horario;
    private int sala;
    private float valor;
    private Date dataNascimento;
    private int numeroCarteiraEstudante;

    public EntradaDeCinema(Date dataDoFilme, int horario, int sala, float valor) {
        this.dataDoFilme = dataDoFilme;
        this.horario = horario;
        this.sala = sala;
        this.valor = valor;
    }

    public Date getDataDoFilme() {
        return dataDoFilme;
    }
    public void setDataDoFilme(Date dataDoFilme) {
        this.dataDoFilme = dataDoFilme;
    }
    public int getHorario() {
        return horario;
    }
    public void setHorario(int horario) {
        this.horario = horario;
    }
    public int getSala() {
        return sala;
    }
    public void setSala(int sala) {
        this.sala = sala;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public int getNumeroCarteiraEstudante() {
        return numeroCarteiraEstudante;
    }
    public void setNumeroCarteiraEstudante(int numeroCarteiraEstudante) {
        this.numeroCarteiraEstudante = numeroCarteiraEstudante;
    }

    private int calculaIdade(Date dataNascimento) {
        Date dataAtual = new Date();
        int idade = (int) ((dataAtual.getTime() - dataNascimento.getTime()) / (1000 * 60 * 60 * 24 * 365));
        return idade;
    }
    public float calculaDesconto(Date dataNascimento, int numeroCarteiraEstudante) {
        int idade = calculaIdade(dataNascimento);
        if (idade < 12) {
            return valor * 0.5f;
        } else if (idade >= 12 && idade <= 15) {
            if (numeroCarteiraEstudante > 0) {
                return valor * 0.6f;
            } else {
                return valor * 0.4f;
            }
        } else if (idade >= 16 && idade <= 20) {
            if (numeroCarteiraEstudante > 0) {
                return valor * 0.7f;
            } else {
                return valor * 0.3f;
            }
        } else if (idade > 20) {
            if (numeroCarteiraEstudante > 0) {
                return valor * 0.8f;
            } else {
                return valor * 0.2f;
            }
        }
        return valor;
    }

    public float calculaDescontoHorario(float desconto) {
        if (horario < 16) {
            return valor * 0.9f;
        }
        return valor;
    }

    public float calculaDescontoTotal() {
        float desconto = calculaDesconto(dataNascimento, numeroCarteiraEstudante);
        desconto = calculaDescontoHorario(desconto);
        return desconto;
    }

    public String toString() {
        return "Entrada de cinema: \n" +
                "Data do filme: " + dataDoFilme + "\n" +
                "Horário: " + horario + "\n" +
                "Sala: " + sala + "\n" +
                "Valor: " + valor + "\n" +
                "Desconto: " + calculaDescontoTotal();
    }
}
