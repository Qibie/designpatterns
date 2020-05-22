package strategy;

/**
 * @author qibie
 * @date 2020/05/22
 */
public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can't fly");
	}

}
