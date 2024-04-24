package ducks;

import app.Duck;
import duckBehaviors.flyBehavior.FlyWithWings;
import duckBehaviors.quackBehavior.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck.");
	}
}
