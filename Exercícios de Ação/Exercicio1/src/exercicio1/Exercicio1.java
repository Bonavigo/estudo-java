package exercicio1;

import java.awt.*;
import javax.swing.*;

public class Exercicio1 extends JFrame {
    public Exercicio1() {
        JPanel painel = new JPanel();
        JButton botao = new JButton("Ação");
        painel.setLayout(new FlowLayout());
        painel.add(botao);
        setTitle("Teste Ação");
        setContentPane(painel);
        setSize(150,70);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Exercicio1 t = new Exercicio1();
        t.setVisible(true);
    }
}
