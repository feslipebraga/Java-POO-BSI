package ducks;

import app.Duck;
import duckBehaviors.flyBehavior.FlyWithWings;
import duckBehaviors.quackBehavior.Quack;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("Este é um Redhead Duck.");
	}
}