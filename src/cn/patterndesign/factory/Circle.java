package cn.patterndesign.factory;

/**
 * 创建实现接口的实体类Circle
 * @author qibie
 * @createDate:2018-05-23
 * @ProjectName:jdbc
 */
public class Circle implements Shape {

	/* (non-Javadoc)
	 * @see cn.patterndesign.factory.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}
