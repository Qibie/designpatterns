/**
 * Copyright © 2018 qibie Tech Ltd. All rights reserved.
 */
package cn.patterndesign.abstractFactory;

/**
 * 5. 为 Color 和 Shape 对象创建抽象类来获取工厂
 * @author qibie
 * @createDate:2018-05-27
 * @ProjectName:designpattern
 */
public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape);
}
