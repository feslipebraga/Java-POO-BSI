package app;

public class DivObserver implements Observer {
    private ConcreteSubject concreteSubject;

    public DivObserver(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
        this.concreteSubject.registerObserver(this);
    }

    public void update(int valor1, int valor2) {
        int result = valor1 / valor2;
        System.out.println("Resultado da divisão inteira: " + result);
    }
}
