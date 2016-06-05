package DuckModel;

public abstract class Duck {
	
   QuackBehavior quackBehavior;
   FlyBehavior flyBehavior;
   
   public void performQuack() {
      quackBehavior.quack();
   }
   public void performFly() {
	  flyBehavior.fly();
   }
}