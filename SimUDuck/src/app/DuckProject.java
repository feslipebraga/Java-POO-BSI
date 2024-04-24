package app;

import duckBehaviors.flyBehavior.FlyNoWay;
import duckBehaviors.quackBehavior.MuteQuack;
import ducks.*;

public class DuckProject {
    public static void main(String[] args) {
    	
        MallardDuck mallard = new MallardDuck();

        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        // alterando os valores de quack e fly para o objeto mallard
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.setQuackBehavior(new MuteQuack());
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        
        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.performQuack();
        redheadDuck.performFly();
        
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();
        
        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performQuack();
        decoyDuck.performFly();
    }
}
