    package ScrumProject;
    import javax.swing.JOptionPane;
    import oru.inf.InfDB;
    import oru.inf.InfException;
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
    //Här är huvudconnection med databasen. 
    public class Start {
    private static InfDB bloggdb;

    public Start(){

    }
    public static void main(String[] args) {
         try{ 
    bloggdb = new InfDB("C:\\db\\Bloggdb.FDB"); 
    }
    catch(InfException e){ 

    JOptionPane.showMessageDialog(null,"Login misslyckad"); 
    System.out.println("DBuppkoplingen misslyckad. Felmeddelande: " + e.getMessage()); 
    }
        new Login (bloggdb).setVisible(true); 

        }  
    }
