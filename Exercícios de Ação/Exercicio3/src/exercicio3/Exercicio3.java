package exercicio3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercicio3 extends JFrame implements ActionListener {
    public static void main(String[] args) {
        Exercicio3 t = new Exercicio3();
        
        JPanel painel = new JPanel();
        JButton b1 = new JButton("Ação 1");
        JButton b2 = new JButton("Ação 2");
        
        b1.addActionListener(t);
        b2.addActionListener(t);
        
        painel.setLayout(new FlowLayout());
        painel.add(b1);
        painel.add(b2);
        
        t.setTitle("Teste Ação 4");
        t.setContentPane(painel);
        t.setSize(150,100);
        t.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "Mensagem", "Ação", JOptionPane.INFORMATION_MESSAGE);
    }
}
