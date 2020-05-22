package strategy.behaviorimplements;

import strategy.behavior.QuackBehavior;

/**
 * @author qibie
 * @date 2020/05/22
 */
public class Quack implements QuackBehavior {

	/*
	 * (non-Javadoc)
	 * 
	 * @see strategy.QuackBehavior#quack()
	 */
	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
