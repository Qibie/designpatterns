package factory;

/**
 * 创建实现接口的实体类Rectangle
 * @author qibie
 * @createDate:2018-05-23
 * @ProjectName:jdbc
 */
public class Rectangle implements Shape {

	/* (non-Javadoc)
	 * @see cn.patterndesign.factory.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}

}
