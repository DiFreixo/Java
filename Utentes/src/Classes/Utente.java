
package Classes;

import java.util.ArrayList;

public class Utente extends Pessoa {
    //atributo
    private double NISS;
 
    public static ArrayList<Utente> listaUtentes = new ArrayList<Utente>();
    
    public double getNISS() {
        return NISS;
    }
    
    public void setNISS(double NISS) {
        this.NISS = NISS;
    }
}
