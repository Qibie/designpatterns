package strategy;

import strategy.behaviorimplements.FlyWings;
import strategy.behaviorimplements.Quack;

/**
 * @author qibie
 * @date 2020/05/22
 */
public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWings();
	}
	/* (non-Javadoc)
	 * @see strategy.Duck#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a real Mallard duck");
	}

}
