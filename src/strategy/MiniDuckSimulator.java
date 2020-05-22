package strategy;

import strategy.behaviorimplements.FlyRocketPowered;

/**
 * @author qibie
 * @date 2020/05/22
 */
public class MiniDuckSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		mallard.swim();
		mallard.display();
		
		Duck model = new ModelDuck();
		// call origin delegate flyBehavior instance
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
