package exercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercicio2 extends JFrame implements ActionListener {
    public static void main(String[] args) {
        Exercicio2 t = new Exercicio2();
        
        JPanel painel = new JPanel();
        JButton botao = new JButton("Ação");
        
        botao.addActionListener(t);
        
        painel.setLayout(new FlowLayout());
        painel.add(botao);
        
        t.setTitle("Teste Ação 4");
        t.setContentPane(painel);
        t.setSize(150,70);
        t.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "Mensagem", "Ação", JOptionPane.INFORMATION_MESSAGE);
    }
}
