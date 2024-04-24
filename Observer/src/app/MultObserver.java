package app;

public class MultObserver implements Observer {
    private ConcreteSubject concreteSubject;

    public MultObserver(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
        this.concreteSubject.registerObserver(this);
    }

    public void update(int valor1, int valor2) {
        int result = valor1 * valor2;
        System.out.println("Resultado da multiplicação: " + result);
    }
}