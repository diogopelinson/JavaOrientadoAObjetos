package java_objetos.carros;

import java_objetos.interfaces.Carro;

public class Mustang implements Carro {

    @Override
    public void acelerar() {
        System.out.println("Acelerando a 100km/hr");
    }

    @Override
    public void freiar() {

    }

    @Override
    public void parar() {

    }
}
