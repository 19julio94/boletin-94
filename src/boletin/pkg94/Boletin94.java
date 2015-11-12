
package boletin.pkg94;

/**
 *
 * @author jpatriciodasilva
 */
import javax.swing.JOptionPane;
public class Boletin94 {

 
    public static void main(String[] args) {
    
        int num=0;
        Tablas obx=new Tablas();
        num=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
        if (num!=0){
            JOptionPane.showMessageDialog(null, obx.calcularTabla(num));
        }
    }
    
}
