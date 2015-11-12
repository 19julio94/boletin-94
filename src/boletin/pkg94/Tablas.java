
package boletin.pkg94;

/**
 *
 * @author jpatriciodasilva
 */
public class Tablas {
    public String calcularTabla (int num){
        String tabla="";
        for(int x=1;x<=10;x++){
        
        tabla=tabla+"\n"+num+" * "+x+" = "+(num*x);
        }
         return tabla;
    }
   
}
