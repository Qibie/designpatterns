/**
 * Copyright © 2018 qibie Tech Ltd. All rights reserved.
 */
package cn.patterndesign.proxy;

/**
 * 2. 创建实现接口的实体类RealImage, ProxyImage  
 * @author qibie
 * @createDate:2018-05-27
 * @ProjectName:designpattern
 */
public class ProxyImage implements Image {
	private RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}
}
