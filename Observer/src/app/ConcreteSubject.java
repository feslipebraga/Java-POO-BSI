package app;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
	private List<Observer> observers = new ArrayList<>();
	private int valor1;
	private int valor2;
	
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(valor1, valor2);
		}
	}
	
	public void setValues(int valor1, int valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
		valorChanged();
	}
	
    public int getValor1() {
        return valor1;
    }

    public int getValor2() {
        return valor2;
    }

    private void valorChanged() {
        notifyObserver();
    }
}
