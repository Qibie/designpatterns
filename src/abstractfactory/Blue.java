/**
 * Copyright © 2018 qibie Tech Ltd. All rights reserved.
 */
package abstractfactory;

/**
 * 4. 创建实现颜色接口的实体类
 * @author qibie
 * @createDate:2018-05-27
 * @ProjectName:designpattern
 */
public class Blue implements Color {

	/* (non-Javadoc)
	 * @see cn.patterndesign.abstractFactory.Shape#draw()
	 */
	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}

}
