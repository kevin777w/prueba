
package splash;

import Login.PruebaLogin;
import javax.swing.JOptionPane;

/**
 *
 * @author ivan_
 */
public class Splash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ventanasplash splash = new ventanasplash();
        
        splash.setLocationRelativeTo(null);
        
        splash.setVisible(true);
        
        for(int i=0; i<=100; i++){
            try{
               Thread.sleep(60); 
            }catch(Exception e){
                
            }
                
          
            System.out.println( i +"%");
            splash.Progress.setValue(i);
        }
        splash.dispose();
        
        PruebaLogin PL= new PruebaLogin();
        PL.setVisible(true);
        
        
        
    }
    
}
