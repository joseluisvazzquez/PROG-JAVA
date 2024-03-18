package GUI;

import javax.swing.SwingUtilities;

public class AdivinarNumeroApp {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(AdivinarNumero::new);
    }
}