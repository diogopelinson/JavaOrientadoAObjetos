package java_objetos;

// public = acessivel de todo lugar
// default = quando eu nao defino, ele segue como default
// private = acessivel somente dentro da classe que foi definido
// protected = acessivel por todo mundo que esta no mesmo pacote

import java_objetos.servivo.Humano;
import java_objetos.servivo.SerVivo;
import java_objetos.carros.Mustang;
import java_objetos.carros.Sandero;
import java_objetos.interfaces.Carro;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Sandero();
        Carro meuCarro2 = new Mustang();

        SerVivo meuSer = new Humano();

        meuSer.dormir();
        meuSer.respirar();

        meuCarro2.acelerar();
        meuCarro.acelerar();

        Carro meuCarroFurado = null;

        try{
            meuCarroFurado.acelerar();
        } catch (NullPointerException exception){
            System.out.println("Veder carro furado");
        }






    }
}
