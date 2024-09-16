package exercicio4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercicio4 extends JFrame implements ActionListener {
    private JButton b1;
    private JButton b2;
    
    public static void main(String[] args) {
        Exercicio4 t = new Exercicio4();
        
        JPanel painel = new JPanel();
        t.b1 = new JButton("Ação 1");
        t.b2 = new JButton("Ação 2");
        
        t.b1.addActionListener(t);
        t.b2.addActionListener(t);
        
        painel.setLayout(new FlowLayout());
        painel.add(t.b1);
        painel.add(t.b2);
        
        t.setTitle("Teste Ação 4");
        t.setContentPane(painel);
        t.setSize(150,100);
        t.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1) {
            JOptionPane.showMessageDialog(this, "Botão 1 pressionado", "Ação", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource()==b2) {
            JOptionPane.showMessageDialog(this, "Botão 2 pressionado", "Ação", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
