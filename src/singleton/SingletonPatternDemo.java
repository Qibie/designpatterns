/**
 * Copyright © 2018 qibie Tech Ltd. All rights reserved.
 */
package singleton;

/**
 * 2. 从Singleton类获取唯一的对象
 * @author qibie
 * @createDate:2018-05-27
 * @ProjectName:designpattern
 */
public class SingletonPatternDemo {

	public static void main(String[] args) {
		// 不合法的构造函数
		// 编译时错误：构造函数 SingleObject() 是不可见的
		// SingleObject object = new SingleObject();

		// 获取唯一可用的对象
		SingleObject object = SingleObject.getInstance();
		
		// 显示消息
		object.showMessage();
		
		// 登记式/静态内部类
		SingletonRegist singletonRegist = SingletonRegist.getInstance();
		singletonRegist.showMessage();
	}

}
