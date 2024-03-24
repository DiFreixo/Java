
package exemplo28_classecliente;

public class Parceiro {
    
    //Atributo
    protected String Nome;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    public Parceiro(String n) {
        Nome = n;
    }
    
    //Construtor da classe Parceiro
    public Parceiro() {
        Nome = "";
    }
    
}
