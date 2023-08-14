## Class: Cardapio
- arroz: String
- feijao: String
- carne: String
- vegetariano: String
- guarnicao: String
- folhas: String
- legumes: String
- fruta: String
- suco: String

## Class: Dia
- dia: String
- data: Date
- refeicao: String
+ Dia(...)
+ Dia()
+ getDia(): String
+ setDia(String)
+ getData(): Date
+ setData(String)
+ getRefeicao(): String
+ setRefeicao(String)
+ toString(): String

## Class: CardapioInterface
- cardapioDiario: Map<String, String>
- diasSemana: JComboBox<String>
- dataField: JTextField
- refeicaoField: JComboBox<String>
- arrozField: JTextField
- feijaoField: JTextField
- carneField: JTextField
- vegetarianaField: JTextField
- folhasField: JTextField
- legumeField: JTextField
- frutaField: JTextField
- sucoField: JTextField
- cardapioTextArea: JTextArea
+ CardapioInterface()
+ updateCardapioTextArea()
+ main(String[])
