//componente concreto
public class CardapioFactoryImpl implements CardapioFactory {
    @Override
    public Cardapio criarCardapio() {
        return new Cardapio();
    }

    @Override
    public Dia criarDia() {
        return new Dia();
    }
}