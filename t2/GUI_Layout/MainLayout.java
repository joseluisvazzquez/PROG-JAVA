package GUI_Layout;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class MainLayout extends JFrame{
    private JLabel title1;
    private JTextField txt;
    private JLabel title2;
    private JTextField txt2;
    private JButton button;
    private JRadioButton b;
    private JRadioButton b2;
    private JRadioButton b3;
    private JRadioButton b4;

    public MainLayout(){
        JPanel MainPanel = new JPanel();
        JPanel SecondPanel = new JPanel();
        JPanel textfields = new JPanel();
        JPanel EndPanel = new JPanel();

        MainPanel.setBorder(new EmptyBorder(10,10,10,10));
        MainPanel.setLayout(new GridLayout(6,1,15, 5));
        textfields.setLayout(new GridLayout(2,2,15, 5));
        SecondPanel.setLayout(new GridLayout(2,2,15, 5));
        EndPanel.setLayout(new GridLayout(2,2,15, 5));
        

        title1 = new JLabel("Op 1:");
        txt = new JTextField(); 

        title2 = new JLabel("Op 2:");
        txt2 = new JTextField();

        button = new JButton("Resultado");
        button.setBounds(100,100,100, 40);
        ButtonGroup groupbuttons = new ButtonGroup();
        b = new JRadioButton("Suma", true);
        b2 = new JRadioButton("Resta"); 
        b3 = new JRadioButton("Division"); 
        b4 = new JRadioButton("Multiplicacion");

        JLabel answertitle = new JLabel("Resultado:");
        JTextField answertext = new JTextField();

        groupbuttons.add(b);
        groupbuttons.add(b2);
        groupbuttons.add(b3);
        groupbuttons.add(b4);
        
        textfields.add(title1);
        textfields.add(txt);
        textfields.add(title2);
        textfields.add(txt2);
        MainPanel.add(textfields);
        MainPanel.add(button);

        SecondPanel.add(b);
        SecondPanel.add(b2);
        SecondPanel.add(b3);
        SecondPanel.add(b4);
        MainPanel.add(SecondPanel);

        EndPanel.add(answertitle);
        EndPanel.add(answertext);
        MainPanel.add(EndPanel);

        add(MainPanel); 
        setVisible(true);
        setSize(450, 350);

        button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int Opera1 = Integer.parseInt(txt.getText());
                    int Opera2 = Integer.parseInt(txt2.getText());
                    int sum = Opera1 + Opera2;
                    int res = Opera1 - Opera2;
                    int div = Opera1 / Opera2;
                    int mul = Opera1 * Opera2;

                    String sumtostring = String.valueOf(sum);
                    String restostring = String.valueOf(res);
                    String divtostring = String.valueOf(div);
                    String multostring = String.valueOf(mul);

            
                    if(b.isSelected()){
                        answertext.setText(sumtostring);
                    }else if(b2.isSelected()){
                        answertext.setText(restostring);
                    }else if(b3.isSelected()){
                        answertext.setText(divtostring);
                    }
                    else if(b4.isSelected()){
                        answertext.setText(multostring);
                    }

                } catch (Exception ex) {
                     JOptionPane.showMessageDialog(null, "Que!!!?!?!!?!? Introduce un numero!!");
                }

            }});

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainLayout::new);
    }









    
}