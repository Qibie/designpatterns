package strategy;

/**
 * @author qibie
 * @date 2020/05/22
 */
public class ModelDuck extends Duck {

	public ModelDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}
	/* (non-Javadoc)
	 * @see strategy.Duck#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a model duck");
	}

}
