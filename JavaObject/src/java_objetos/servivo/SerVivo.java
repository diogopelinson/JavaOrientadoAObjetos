package java_objetos.servivo;

// Classe Abstrata, nao pode ser instanciada
// Classe Abstrata pode colocar metodos
public abstract class SerVivo {
    protected int idade;


    public SerVivo(int idade){
        this.idade = idade;
    }
    public abstract void respirar();


    public void dormir(){
        System.out.println("Dormindo....");
    }

}
