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
   
     public static boolean textFaltHarVarde(JTextField rutaAttKolla)  //Om textrutan �r tom s� visa att Inmatningsrutan �r tom.
    {
        boolean resultat = true;        
        if(rutaAttKolla.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Inmatningsrutan �r tom!");
            resultat = false;
            rutaAttKolla.requestFocus();
        }       
        return resultat;
    }
        public static boolean isHeltal(JTextField rutaAttKolla) {  //Om anv�ndare har inte skrivit heltal s� visa ett meddelande.
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
        
        //En metod som validerar ifall ett f�lt �r tomt eller inte och returnerar ett felmeddelande. 
public static boolean faltArTomtSaronManne(JTextField tf) {
        boolean arTom = false;
        if (tf.getText().isEmpty()) {
            arTom = true;
            JOptionPane.showMessageDialog(null, "Textf�ltet f�r inte vara tomt!\n");
            System.out.println("Textf�ltet �r tomt");
            tf.requestFocus();
        }
        return arTom;
    }
    
    public static boolean faltArTomtAreaSaronManne(JTextArea tf) {
        boolean arTom = false;
        if (tf.getText().isEmpty()) {
            arTom = true;
            JOptionPane.showMessageDialog(null, "Textf�ltet f�r inte vara tomt!\n");
            System.out.println("Textf�ltet �r tomt!");
            tf.requestFocus();
        }
        return arTom;
    }
    
    
    
    
    
    public static boolean checkBoxTomSaronManne(ButtonGroup bg) {
        boolean arTom = false;
        if (bg.getSelection() == null) {
            arTom = true;
            JOptionPane.showMessageDialog(null, "Ange typ av inl�gg.");
            System.out.println("Inl�gget �r tomt.");

        }
        return arTom;
    }       
}

