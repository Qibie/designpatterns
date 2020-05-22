package strategy.behaviorimplements;

import strategy.behavior.FlyBehavior;

/**
 * @author qibie
 * @date 2020/05/22
 */
public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying with a rocket");
	}

}
