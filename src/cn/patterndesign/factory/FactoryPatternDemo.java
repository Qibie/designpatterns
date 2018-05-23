package cn.patterndesign.factory;

/**
 * 使用该工厂ShapeFactory类，通过传递类型信息来获取实体类的对象
 * @author qibie
 * @createDate:2018-05-23
 * @ProjectName:jdbc
 */
public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		System.out.println("教程中写法");
		//获取Circle的对象，并调用它的draw方法
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		
		//获取 Rectangle的对象，并调用它的draw方法
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		
		//获取Square的对象，并调用它的draw方法
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape1.draw();
		
		System.out.println("==========================");
		System.out.println("使用反射技术的写法:");
		Rectangle rectangle = (Rectangle) ShapeFactoryByReflection.getShape(Rectangle.class);
		rectangle.draw();
		System.out.println("使用反射技术的写法，使用泛型方法，省去强制类型转换:");
		Circle circle = ShapeFactoryByReflection.getClass(Circle.class);
		circle.draw();
	}

}
