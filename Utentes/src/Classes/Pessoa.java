
package Classes;

public class Pessoa {
    //atributos
    protected String Nome;
    protected String Morada;
    
    //métodos para obter e definir
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getMorada() {
        return Morada;
    }

    public void setMorada(String Morada) {
        this.Morada = Morada;
    }
    
    //Construtor
    public Pessoa() {
        Nome = "";
        Morada = "";
    }
}
