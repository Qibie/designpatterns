/**
 * Copyright © 2018 qibie Tech Ltd. All rights reserved.
 */
package cn.patterndesign.abstractFactory;

/**
 * 7. 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂
 * @author qibie
 * @createDate:2018-05-27
 * @ProjectName:designpattern
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}
}
