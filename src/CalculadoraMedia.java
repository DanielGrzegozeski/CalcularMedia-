import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraMedia extends JFrame {
    public JPanel calcularMedia;



    public JPanel getCalcularMedia() {
        return calcularMedia;
    }

    public void setCalcularMedia(JPanel calcularMedia) {
        this.calcularMedia = calcularMedia;
    }

    private JTextField primeiroNumero;
    private JTextField segundoNumero;
    private JButton calcularMédiaButton;
    private JTextField resultadoMedia;
    private JTextField sr;


    public JTextField getPrimeiroNumero() {
        return primeiroNumero;
    }

    public void setPrimeiroNumero(JTextField primeiroNumero) {
        this.primeiroNumero = primeiroNumero;
    }

    public JTextField getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(JTextField segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public JButton getCalcularMédiaButton() {
        return calcularMédiaButton;
    }

    public void setCalcularMédiaButton(JButton calcularMédiaButton) {
        this.calcularMédiaButton = calcularMédiaButton;
    }

    public JTextField getResultadoMedia() {
        return resultadoMedia;
    }

    public void setResultadoMedia(JTextField resultadoMedia) {
        this.resultadoMedia = resultadoMedia;
    }

    public JTextField getSr() {
        return sr;
    }

    public void setSr(JTextField sr) {
        this.sr = sr;
    }

    public CalculadoraMedia() {
        calcularMédiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.valueOf(primeiroNumero.getText());
                Double numero2 = Double.valueOf(segundoNumero.getText());




                Double resultadoSoma = (numero1 + numero2)/2;

                resultadoMedia.setText(resultadoSoma.toString());

                if (resultadoSoma >= 7){
                    sr.setText("Aprovado");

                }else if (resultadoSoma < 7){
                    sr.setText("Reprovado");
                }
            }
        });


    }
}
