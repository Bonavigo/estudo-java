package mod1_janelasimples;

import java.awt.*;

public class Mod1_JanelaSimples {
    public static void main(String[] args) {
        Frame frame = new Frame("Exemplo AWT");
        Label label = new Label("Olá, mundo!");
        
        frame.add(label);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
