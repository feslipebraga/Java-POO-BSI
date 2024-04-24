package app;

public class ModObserver implements Observer {
    private ConcreteSubject concreteSubject;

    public ModObserver(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
        this.concreteSubject.registerObserver(this);
    }

    public void update(int valor1, int valor2) {
        int result = valor1 % valor2;
        System.out.println("Resto da divisão: " + result);
    }
}
