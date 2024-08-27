import java.awt.Button;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.TextField;

public class JanelaAWT extends Frame {

    Dimension dim, dim2, dim3;
    Button Botao1;
    TextField CampoTexto;
    Label texto;

    public JanelaAWT () {
        dim = new Dimension(400,300);
        dim2 = new Dimension(150,20);
        dim3 = new Dimension(60,20);
        setTitle("Usando a classe dimensão");
        setResizable(false);
        setSize(dim);
        setLocation(100,100);
        setBackground(Color.white);
        setLayout(null);
        texto = new Label("Este é um programa Windows Desktop");
        texto.setLocation(50,80);
        texto.setSize(dim2);
        CampoTexto = new TextField("Digite um texto aqui");
        CampoTexto.setLocation(50,100);
        CampoTexto.setSize(dim2);
        Botao1 = new Button("Sair");
        Botao1.setLocation(50,100);
        Botao1.setSize(dim3);
        Botao1.setBackground(Color.red);
        Botao1.setForeground(Color.white);

        add(texto);
        add(CampoTexto);
        add(Botao1);
    }

    public static void main(String[] args) {
        new JanelaAWT().setVisible(true);
    }
}
