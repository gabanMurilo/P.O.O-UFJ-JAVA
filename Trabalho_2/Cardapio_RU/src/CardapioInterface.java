import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class CardapioInterface extends JFrame {
    private Map<String, String> cardapioDiario;

    private JComboBox<String> diasSemana;
    private JTextField dataField;
    private JComboBox<String> refeicaoField;
    private JTextField arrozField;
    private JTextField feijaoField;
    private JTextField carneField;
    private JTextField vegetarianaField;
    private JTextField folhasField;
    private JTextField legumeField;
    private JTextField frutaField;
    private JTextField sucoField;
    private JTextArea cardapioTextArea;
    private JDialog dialog;

    public CardapioInterface() {
        cardapioDiario = new HashMap<>();

        diasSemana = new JComboBox<>(new String[]{"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira"});
        dataField = new JTextField(10);
        refeicaoField = new JComboBox<>(new String[]{"Almoço", "Jantar"});
        arrozField = new JTextField(15);
        feijaoField = new JTextField(15);
        carneField = new JTextField(15);
        vegetarianaField = new JTextField(15);
        folhasField = new JTextField(15);
        legumeField = new JTextField(15);
        frutaField = new JTextField(15);
        sucoField = new JTextField(15);

        JButton cadastrarButton = new JButton("Cadastrar Refeição");
        cadastrarButton.addActionListener(e -> {
            String dia = (String) diasSemana.getSelectedItem();
            String cardapio = String.format("Data: %s-%s \nArroz: %s\nFeijão: %s\nCarne: %s\nVegetariana: %s\nFolhas: %s\nLegume: %s\nFruta: %s\nSuco: %s",
                    dataField.getText(), refeicaoField.getSelectedItem(), arrozField.getText(), feijaoField.getText(), carneField.getText(), vegetarianaField.getText(),
                    folhasField.getText(), legumeField.getText(), frutaField.getText(), sucoField.getText());
            cardapioDiario.put(dia, cardapio);
            updateCardapioTextArea();
        });

        cardapioTextArea = new JTextArea(10, 30);
        cardapioTextArea.setEditable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(14, 2));
        panel.add(new JLabel("Dia da Semana:"));
        panel.add(diasSemana);
        panel.add(new JLabel("Data:"));
        panel.add(dataField);
        panel.add(new JLabel("Refeição:"));
        panel.add(refeicaoField);
        panel.add(new JLabel("Arroz:"));
        panel.add(arrozField);
        panel.add(new JLabel("Feijão:"));
        panel.add(feijaoField);
        panel.add(new JLabel("Carne:"));
        panel.add(carneField);
        panel.add(new JLabel("Vegetariana:"));
        panel.add(vegetarianaField);
        panel.add(new JLabel("Folhas:"));
        panel.add(folhasField);
        panel.add(new JLabel("Legume:"));
        panel.add(legumeField);
        panel.add(new JLabel("Fruta:"));
        panel.add(frutaField);
        panel.add(new JLabel("Suco:"));
        panel.add(sucoField);
        panel.add(cadastrarButton);

        JScrollPane scrollPane = new JScrollPane(cardapioTextArea);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(panel, BorderLayout.WEST);
        contentPane.add(scrollPane, BorderLayout.EAST);

        setTitle("Cardápio do Restaurante Universitário");
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void updateCardapioTextArea() {
        StringBuilder text = new StringBuilder();
        for (Map.Entry<String, String> entry : cardapioDiario.entrySet()) {
            text.append(entry.getKey()).append(":\n").append(entry.getValue()).append("\n\n");
        }
        cardapioTextArea.setText(text.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CardapioInterface();
            }
        });
    }
}
