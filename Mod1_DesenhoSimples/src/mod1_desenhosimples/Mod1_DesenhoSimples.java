package mod1_desenhosimples;

import java.awt.*;

public class Mod1_DesenhoSimples extends Canvas {
    public static void main(String[] args) {
        Frame frame = new Frame("Exemplo de Desenho AWT");
        Canvas canvas = new Mod1_DesenhoSimples();
       
        frame.add(canvas);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
    
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawLine(50, 50, 150, 150);
        g.setColor(Color.blue);
        g.fillRect(200, 50, 100, 100);
        g.setColor(Color.green);
        g.fillOval(100, 200, 150, 100);
    }
}
