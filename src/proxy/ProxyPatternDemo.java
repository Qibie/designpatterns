/**
 * Copyright © 2018 qibie Tech Ltd. All rights reserved.
 */
package proxy;

/**
 * 3. 当被请求时，使用ProxyImage来获取RealImage类的对象
 * @author qibie
 * @createDate:2018-05-27
 * @ProjectName:designpattern
 */
public class ProxyPatternDemo {
	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");

		// 图像将从磁盘加载
		image.display();
		System.out.println("");
		// 图像将无法从磁盘加载
		image.display();
	}
}
