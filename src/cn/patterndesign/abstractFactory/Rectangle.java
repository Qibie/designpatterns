/**
 * Copyright © 2018 qibie Tech Ltd. All rights reserved.
 */
package cn.patterndesign.abstractFactory;

/**
 * 2. 创建实现形状接口的实体类
 * @author qibie
 * @createDate:2018-05-27
 * @ProjectName:designpattern
 */
public class Rectangle implements Shape {

	/* (non-Javadoc)
	 * @see cn.patterndesign.abstractFactory.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw()");
	}

}
