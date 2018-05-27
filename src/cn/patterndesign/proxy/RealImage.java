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
public class RealImage implements Image {
	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying " + fileName);
	}

	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName);
	}
}
