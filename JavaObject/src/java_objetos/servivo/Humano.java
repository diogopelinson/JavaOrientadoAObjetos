package java_objetos.servivo;

// Heranca, herda outras classes, astributos, metodos

public class Humano extends SerVivo {
    public String nome;
    public Humano(){
        // super: aciona o construtor da classe mae
        super(42);
        this.nome = "Diogo";
    }
    @Override
    public void respirar() {
        System.out.println("Respirando");
    }
}
