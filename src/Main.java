import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {

        CalculadoraMedia form = new CalculadoraMedia();

        form.setContentPane(form.calcularMedia);
        form.setVisible(true);
        form.setTitle("conversor");
        form.setSize(300,500);
    }}