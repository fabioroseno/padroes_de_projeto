package br.com.gof.singleton;

public class AplicacaoSingleton {
    public static void main(String args[]) {
        Singleton l = Singleton.getInstancia();
        Singleton s = Singleton.getInstancia();
        System.out.println(l);
        System.out.println(s);
    } 
            
}
