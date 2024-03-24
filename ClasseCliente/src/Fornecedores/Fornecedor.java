
package Fornecedores;

import exemplo28_classecliente.Parceiro;
import java.util.ArrayList;


public class Fornecedor extends Parceiro {
    private int NIF;

    public static ArrayList<Fornecedor> listaFornecedores = new ArrayList<Fornecedor>();
    
    public int getNIF() {
        return NIF;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }
    
 
    public Fornecedor(int NIF, String Nome) {
        this.NIF = NIF;
        this.Nome = Nome;
    }
}
