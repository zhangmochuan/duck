package DuckTestl;

import DuckModel.Duck;
import DuckModel.MallardDuck;
import DuckModel.RedheadDuck;
import DuckModel.RubberDuck;

public class TestClass {
	
	public static void main(String[] args) {
		Duck duck1 = new MallardDuck();
		System.out.println("��һֻѼ�ӷ�");
		duck1.performFly();
		System.out.println("��һֻѼ�ӽ�");
		duck1.performQuack();
		
		Duck duck2 = new RubberDuck();
		System.out.println("�ڶ�ֻѼ�ӷ�");
		duck2.performFly();
		System.out.println("�ڶ�ֻѼ�ӽ�");
		duck2.performQuack();
		
		Duck duck3 = new RedheadDuck();
		System.out.println("����ֻѼ�ӷ�");
		duck3.performFly();
		System.out.println("����ֻѼ�ӽ�");
		duck3.performQuack();
		
	}
	
}
