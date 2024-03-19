package GUI_Battleship;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
 

public class Battleship extends JFrame {
    private JLabel titulo;
    private JButton start;
    

    public Battleship(){
        JPanel p = new JPanel();
        p.setBorder(new EmptyBorder(10,10,10,10));
        p.setLayout(new GridLayout(2,1, 10, 10));
        titulo = new JLabel("       Battleship Game");
        start = new JButton("START");
        p.add(titulo);
        p.add(start);
        add(p);
        setVisible(true);
        setSize(450, 150);
        start.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(BattleshipGame::new);
            }
            
        });


        
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Battleship::new);
    }
}