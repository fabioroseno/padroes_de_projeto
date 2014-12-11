package br.com.patterns.criacionais.singleton;

public class TesteSingleton {
    public static void main(String args[]) {
        Singleton l = Singleton.getInstancia();
        Singleton s = Singleton.getInstancia();
        System.out.println(l);
        System.out.println(s);
    } 
            
}
