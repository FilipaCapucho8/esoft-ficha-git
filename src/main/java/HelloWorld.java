import javax.swing.*;

public class HelloWorld extends JFrame {
    private JPanel panel1;
    public HelloWorld(){
        setContentPane(panel1);
        pack();
        // Cria o JLabel com o texto desejado
        JLabel lblMensagem2 = new JLabel("O João Silva esteve aqui");

        // Adiciona o JLabel ao painel
        panel1.add(lblMensagem2);
    }
    
    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }
}
