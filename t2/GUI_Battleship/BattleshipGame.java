package GUI_Battleship;

import java.awt.GridLayout;

import javax.swing.JButton; 
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BattleshipGame extends JFrame {
    private int table = 5;
    private JButton buttons;


    public BattleshipGame() {
        for(int i = 0; i < table*table; i++){
            buttons = new JButton();
            add(buttons);
            buttons.setSize(30,30);
        }
        
        setLayout(new GridLayout(table,table));
        setVisible(true);
        pack();

    }
    
}