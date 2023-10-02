//copmonente abstrato
public interface CardapioFactory {
    Cardapio criarCardapio();
    Dia criarDia();
}
//O Abstract Factory é um padrão de projeto criacional que permite que você
// produza famílias de objetos relacionados sem ter que especificar suas classes concretas.
// O padrão Abstract Factory sugere que você declare uma interface abstrata para todas as
// fábricas, e depois implemente uma fábrica concreta para cada família de produtos.
