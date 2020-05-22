package strategy.behaviorimplements;

import strategy.behavior.FlyBehavior;

/**
 * @author qibie
 * @date 2020/05/22
 */
public class FlyWings implements FlyBehavior {

	/* (non-Javadoc)
	 * @see strategy.FlyBehavior#fly()
	 */
	@Override
	public void fly() {
		System.out.println("I'm flying");
	}
}
