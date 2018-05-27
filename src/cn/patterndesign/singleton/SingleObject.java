/**
 * Copyright © 2018 qibie Tech Ltd. All rights reserved.
 */
package cn.patterndesign.singleton;

/**
 * 1. 创建一个Singleton类SingleObject.java
 * @author qibie
 * @createDate:2018-05-27
 * @ProjectName:designpattern
 */
public class SingleObject {
	// 创建SingleObject的一个对象
	private static SingleObject instance = new SingleObject();
	
	// 让构造函数为 private，这样该类就不会被实例化
	private SingleObject() {}
	
	// 获取唯一可用的对象
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello Singleton");
	}
}
