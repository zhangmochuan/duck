package DuckTestl;

import DuckModel.Duck;
import DuckModel.MallardDuck;
import DuckModel.RedheadDuck;
import DuckModel.RubberDuck;

public class TestClass {
	
	public static void main(String[] args) {
		Duck duck1 = new MallardDuck();
		System.out.println("第一只鸭子飞");
		duck1.performFly();
		System.out.println("第一只鸭子叫");
		duck1.performQuack();
		
		Duck duck2 = new RubberDuck();
		System.out.println("第二只鸭子飞");
		duck2.performFly();
		System.out.println("第二只鸭子叫");
		duck2.performQuack();
		
		Duck duck3 = new RedheadDuck();
		System.out.println("第三只鸭子飞");
		duck3.performFly();
		System.out.println("第三只鸭子叫");
		duck3.performQuack();
		
	}
	
}
