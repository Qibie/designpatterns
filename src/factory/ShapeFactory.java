package factory;

/**
 * 创建一个工厂，生成基于给定信息的实体类的对象，使用getShape方法获取形状类型的对象
 * @author qibie
 * @createDate:2018-05-23
 * @ProjectName:jdbc
 */
public class ShapeFactory {
	// 教程中写法，后续做优化
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		} else {
			throw new IllegalArgumentException("没有对应的接口实现类！");
		}
	}
}
