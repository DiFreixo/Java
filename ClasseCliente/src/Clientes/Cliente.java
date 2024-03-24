
package Clientes;

import exemplo28_classecliente.Parceiro;
import java.util.ArrayList;

public class Cliente extends Parceiro {
    //Atributo
    private int NIF;

    //ArrayList é um vetor dinâmico\\\\\\\\\\\\\\\\\\\= para inicializar o vetor
    //static ArrayList vai estar disponível ao nível da classe (tipo uma variável global)
    public static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    
    public int getNIF() {
        return NIF;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }
    
    //Construtor da Classe Cliente
    public Cliente(int NIF, String Nome) {
        this.NIF = NIF;
        this.Nome = Nome;
    }
}
