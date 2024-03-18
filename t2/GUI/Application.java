package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Application extends JFrame{
    private JLabel Operando1;
    private JTextField Op1;
    private JLabel Operando2;
    private JTextField Op2;
    private JButton suma;
    private JLabel Resultado;
    private JTextField Res;

    public Application(){
        JPanel p = new JPanel();
        p.setBorder(new EmptyBorder(10,10,10,10));
        p.setLayout(new GridLayout(4,2, 10, 10));
        Operando1 = new JLabel("Operando 1:");
        Op1 = new JTextField();

        Operando2 = new JLabel("Operando 2:");
        Op2 = new JTextField();

        suma = new JButton("SUMAR");

        Resultado = new JLabel("Resultado:");
        Res = new JTextField();

        p.add(Operando1);
        p.add(Op1);

        p.add(Operando2);
        p.add(Op2);

        p.add(suma);

        p.add(Resultado);
        p.add(Res);
        add(p);
        setVisible(true);
        setSize(550,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 


        suma.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int Opera1 = Integer.parseInt(Op1.getText());
                    int Opera2 = Integer.parseInt(Op2.getText());
                    int sum = Opera1 + Opera2;
                    String sumtostring = String.valueOf(sum);
                    Res.setText(sumtostring);
                } catch (Exception ex) {
                     JOptionPane.showMessageDialog(null, "Que!!!?!?!!?!? Introduce un numero!!");
                }
            } 
        });
    }
}