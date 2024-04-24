package ducks;

import app.Duck;
import duckBehaviors.flyBehavior.FlyNoWay;
import duckBehaviors.quackBehavior.Squeak;

public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}

	@Override
	public void display() {
		System.out.println("I'm a Rubber Duck");
	}

}