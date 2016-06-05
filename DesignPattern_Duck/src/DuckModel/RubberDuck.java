package DuckModel;

public class RubberDuck extends Duck {
	public RubberDuck() {
	  quackBehavior = new Squack();
      flyBehavior = new FlyNoWay();
	}
}
