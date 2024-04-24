package ducks;

import app.Duck;
import duckBehaviors.flyBehavior.FlyNoWay;
import duckBehaviors.quackBehavior.MuteQuack;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}

	// Método para exibir informações específicas sobre o DecoyDuck
	@Override
	public void display() {
		System.out.println("Este é um Decoy Duck.");
	}
}