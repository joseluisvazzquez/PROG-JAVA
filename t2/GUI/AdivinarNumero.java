package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class AdivinarNumero extends JFrame{
    private JLabel text;
    private JTextField textform;
    private JButton boton;

    public AdivinarNumero(){
       
        // getContentPane().setLayout(new GridLayout(3,1));

        text = new JLabel("Adivina un numero del 1 al 100...");
        textform = new JTextField(8);
        boton = new JButton("Adivinar");

        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(10,10,10,10));
        panel.setLayout(new GridLayout(3,1, 10, 10));
        panel.add(text);
        
        panel.add(textform);
        
        panel.add(boton);

       add(panel);
        Random r = new Random();
        int randomInt = r.nextInt(100) + 1;

        boton.addActionListener((ActionListener) new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
               
                try {
                    int adivinat = Integer.parseInt(textform.getText());
                    if(adivinat == randomInt){
                        JOptionPane.showMessageDialog(null, "ACERTASTE!!!! INCREIBLE!!!!");
                    }else if( adivinat > randomInt){
                        JOptionPane.showMessageDialog(null, "Es muy alto!!! Baja un poco!!");
                    }else if( adivinat < randomInt){
                        JOptionPane.showMessageDialog(null, "Es muy bajo!!! Sube un poco!!");
                    };

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Que!!!?!?!!?!? Introduce un numero!!");
                }
            }
        });

        setVisible(true);
        setSize(350,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        //Añadir configuracion del JFrame (this)

    }
}
