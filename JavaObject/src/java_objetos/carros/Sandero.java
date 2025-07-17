package java_objetos.carros;

import java_objetos.interfaces.Carro;

public class Sandero implements Carro {
    // final: valor que nunca vai ser redefinido
    final int limiteDeVelocidade = 150;

    public int velocidadeAtual = 0;

    // @Override: Sobrescreve oque vem da interface
    @Override
    public void acelerar() {
        if(this.velocidadeAtual < this.limiteDeVelocidade){
            this.velocidadeAtual += 10;
            System.out.println("Acelerando");
        }
        System.out.println("Velocidade Atual" + this.velocidadeAtual);
    }

    @Override
    public void freiar() {

    }

    @Override
    public void parar() {

    }
}
