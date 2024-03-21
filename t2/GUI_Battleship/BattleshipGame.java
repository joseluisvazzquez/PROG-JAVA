package GUI_Battleship;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.ArrayList; 
import java.util.List;
import javax.swing.JButton; 
import javax.swing.JFrame;

public class BattleshipGame extends JFrame {
    private int table = 5;
    private int numBarcos = 5;

    public BattleshipGame() {
        pack();
        setVisible(true);
        setLayout(new GridLayout(table,table));
        List<JButton> buttonList = new ArrayList<JButton>();
        Random r = new Random();
        
        for(int i = 0; i < table*table; i++){
            JButton button = new JButton(String.valueOf(i));
            buttonList.add(button);
            add(button);
            
            button.setSize(30,30);

            button.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                        
                        for(int j = 0; j<5; j++){
                            int random1 = r.nextInt(table*table) -1;
                            if(button.getText().equals(String.valueOf(random1))){
                                button.setBackground(Color.GREEN);
                            }else{
                                button.setBackground(Color.BLUE);
                            }
                        }
                    
                }
                
            });
        }
        
        
    }
    
}