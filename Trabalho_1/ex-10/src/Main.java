public class Main {
    public static void main(String[] args) {
        Notas notas = new Notas(10, 10, 10, 10, 10, 10);
        System.out.println(notas.mediaFinal());
        System.out.println(notas.aprovado());

notas.setTrabalho1(5);
notas.setTrabalho2(0);
notas.setTrabalho3(1);
notas.setTrabalho4(0);
notas.setProva1(0);
notas.setProva2(2);
System.out.println(notas.mediaFinal());
System.out.println(notas.aprovado());
    }
}