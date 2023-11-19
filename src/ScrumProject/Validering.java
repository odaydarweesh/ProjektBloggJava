package ScrumProject;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * * @author Saron
 * * @author Manne
 * * @author Jiyan
 * * @author Victoria 
 * * @author Fatemeh
 * * @author Cornelia
 * * @author Samer
 * * @author Michael
 * * @author Rany
 * * @author Oday
 */

public class Validering {
   
     public static boolean textFaltHarVarde(JTextField rutaAttKolla)  //Om textrutan är tom så visa att Inmatningsrutan är tom.
    {
        boolean resultat = true;        
        if(rutaAttKolla.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Inmatningsrutan är tom!");
            resultat = false;
            rutaAttKolla.requestFocus();
        }       
        return resultat;
    }
        public static boolean isHeltal(JTextField rutaAttKolla) {  //Om användare har inte skrivit heltal så visa ett meddelande.
                boolean resultat = true;
                try {
            String inStrang = rutaAttKolla.getText();
            Integer.parseInt(inStrang);
            rutaAttKolla.requestFocus();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Var god ange ett heltal!");
            resultat = false;
        }
        return resultat;
    }
        
        //En metod som validerar ifall ett fält är tomt eller inte och returnerar ett felmeddelande. 
public static boolean faltArTomtSaronManne(JTextField tf) {
        boolean arTom = false;
        if (tf.getText().isEmpty()) {
            arTom = true;
            JOptionPane.showMessageDialog(null, "Textfältet får inte vara tomt!\n");
            System.out.println("Textfältet är tomt");
            tf.requestFocus();
        }
        return arTom;
    }
    
    public static boolean faltArTomtAreaSaronManne(JTextArea tf) {
        boolean arTom = false;
        if (tf.getText().isEmpty()) {
            arTom = true;
            JOptionPane.showMessageDialog(null, "Textfältet får inte vara tomt!\n");
            System.out.println("Textfältet är tomt!");
            tf.requestFocus();
        }
        return arTom;
    }
    
    
    
    
    
    public static boolean checkBoxTomSaronManne(ButtonGroup bg) {
        boolean arTom = false;
        if (bg.getSelection() == null) {
            arTom = true;
            JOptionPane.showMessageDialog(null, "Ange typ av inlägg.");
            System.out.println("Inlägget är tomt.");

        }
        return arTom;
    }       
}

