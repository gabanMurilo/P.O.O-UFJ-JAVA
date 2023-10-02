import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class CardapioApp {
    private Map<String, String> cardapioDiario;
    private JTextArea cardapioTextArea;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CardapioApp::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        CardapioApp cardapioApp = new CardapioApp();
        cardapioApp.init();
    }

    private void init() {
        cardapioDiario = new HashMap<>();

        JFrame frame = new JFrame("Cardapio App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel cardapioPanel = new JPanel();
        cardapioPanel.setLayout(new GridLayout(11, 4));

        // Labels
        JLabel diaLabel = new JLabel("Dia:");
        JComboBox<String> diaComboBox = new JComboBox<>(new String[]{"Segunda", "Terca", "Quarta", "Quinta", "Sexta"});
        JLabel arrozLabel = new JLabel("Arroz:");
        JTextField arrozField = new JTextField();
        JLabel feijaoLabel = new JLabel("Feijao:");
        JTextField feijaoField = new JTextField();
        JLabel carneLabel = new JLabel("Carne:");
        JTextField carneField = new JTextField();
        JLabel vegetarianoLabel = new JLabel("Vegetariano:");
        JTextField vegetarianoField = new JTextField();
        JLabel guarnicaoLabel = new JLabel("Guarnicao:");
        JTextField guarnicaoField = new JTextField();
        JLabel folhasLabel = new JLabel("Folhas:");
        JTextField folhasField = new JTextField();
        JLabel legumesLabel = new JLabel("Legumes:");
        JTextField legumesField = new JTextField();
        JLabel frutaLabel = new JLabel("Fruta:");
        JTextField frutaField = new JTextField();
        JLabel sucoLabel = new JLabel("Suco:");
        JTextField sucoField = new JTextField();

        JButton createDiaButton = new JButton("Cadastrar");

        cardapioPanel.add(diaLabel);
        cardapioPanel.add(diaComboBox);
        cardapioPanel.add(arrozLabel);
        cardapioPanel.add(arrozField);
        cardapioPanel.add(feijaoLabel);
        cardapioPanel.add(feijaoField);
        cardapioPanel.add(carneLabel);
        cardapioPanel.add(carneField);
        cardapioPanel.add(vegetarianoLabel);
        cardapioPanel.add(vegetarianoField);
        cardapioPanel.add(guarnicaoLabel);
        cardapioPanel.add(guarnicaoField);
        cardapioPanel.add(folhasLabel);
        cardapioPanel.add(folhasField);
        cardapioPanel.add(legumesLabel);
        cardapioPanel.add(legumesField);
        cardapioPanel.add(frutaLabel);
        cardapioPanel.add(frutaField);
        cardapioPanel.add(sucoLabel);
        cardapioPanel.add(sucoField);
        cardapioPanel.add(createDiaButton);

        cardapioTextArea = new JTextArea();
        cardapioTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(cardapioTextArea);

        frame.add(cardapioPanel, BorderLayout.WEST);
        frame.add(scrollPane, BorderLayout.CENTER);

        createDiaButton.addActionListener(e -> {
            String dia = (String) diaComboBox.getSelectedItem();
            String arroz = arrozField.getText();
            String feijao = feijaoField.getText();
            String carne = carneField.getText();
            String vegetariano = vegetarianoField.getText();
            String guarnicao = guarnicaoField.getText();
            String folhas = folhasField.getText();
            String legumes = legumesField.getText();
            String fruta = frutaField.getText();
            String suco = sucoField.getText();

            Dia novoDia = new Dia(arroz, feijao, carne, vegetariano, guarnicao, folhas, legumes, fruta, suco);
            novoDia.setDia(dia);

            cardapioDiario.put(dia, novoDia.toString());

            updateCardapioTextArea();
        });

        frame.pack();
        frame.setVisible(true);
    }

    private void updateCardapioTextArea() {
        cardapioTextArea.setText("");
        for (String dia : cardapioDiario.keySet()) {
            cardapioTextArea.append(cardapioDiario.get(dia));
        }
    }
}
