package cn.patterndesign.factory;

/**
 * 创建一个工厂，生成基于给定信息的实体类的对象，使用getShape方法获取形状类型的对象
 * 使用反射机制可以解决每次增加一个产品时，都需要增加一个对象实现工厂的缺点
 * @author qibie
 * @createDate:2018-05-23
 * @ProjectName:jdbc
 */
public class ShapeFactoryByReflection {
	public static Object getShape(Class <? extends Shape> clazz) {
		Object obj = null;
		try {
			// 获取实例，java.lang.Class#newInstance方法在JDK1.9已过时
			// obj = Class.forName(clazz.getName()).newInstance();
			// 这里采用java.lang.reflect.Constructor#newInstance获取对象
			obj = clazz.getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	// 使用泛型方法省略类型强制转换，支持多态
	public static <T> T getClass(Class <? extends T> clazz) {
		T obj = null;
		try {
			// obj = (T) Class.forName(clazz.getName()).newInstance();
			obj = (T) clazz.getDeclaredConstructor().newInstance();
		} catch (ReflectiveOperationException e) {
			e.printStackTrace();
		}
		return obj;
	}
}
