package app;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        
        DivObserver divObserver = new DivObserver(subject);
        ModObserver modObserver = new ModObserver(subject);
        MultObserver multObserver = new MultObserver(subject);

        subject.setValues(7, 4); 
    }
}
