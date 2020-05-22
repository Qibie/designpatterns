/**
 * Copyright © 2018 qibie Tech Ltd. All rights reserved.
 */
package abstractfactory;

/**
 * 8. 使用 FactoryProducer 来获取 AbstractFactory，通过传递类型信息来获取实体类的对象
 * 
 * @author qibie
 * @createDate:2018-05-27
 * @ProjectName:designpattern
 */
public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		// 获取形状工厂
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		// 获取形状为Circle对象并调用Circle的draw方法
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();
		// 获取形状为Rectangle对象并调用Rectangle的draw方法
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();
		// 获取形状为SQUARE对象并调用SQUARE的draw方法
		Shape square = shapeFactory.getShape("SQUARE");
		square.draw();

		// 获取颜色工厂
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		// 获取颜色为Red对象并调用Red的fill方法
		Color red = colorFactory.getColor("RED");
		red.fill();
		// 获取颜色为Blue对象并调用Blue的fill方法
		Color blue = colorFactory.getColor("BLUE");
		blue.fill();
		// 获取颜色为Green对象并调用Green的fill方法
		Color green = colorFactory.getColor("GREEN");
		green.fill();
	}
}
