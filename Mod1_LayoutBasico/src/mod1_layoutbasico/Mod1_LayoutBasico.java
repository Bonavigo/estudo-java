package mod1_layoutbasico;

import java.awt.*;

public class Mod1_LayoutBasico {
    public static void main(String[] args) {
        Frame frame = new Frame("Exemplo de Layout AWT");
        Panel panel = new Panel();
        
        panel.setLayout(new FlowLayout());
        
        panel.add(new Button("Botão 1"));
        panel.add(new Button("Botão 2"));
        panel.add(new Button("Botão 3"));
        
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
