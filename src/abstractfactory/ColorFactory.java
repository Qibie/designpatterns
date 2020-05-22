/**
 * Copyright © 2018 qibie Tech Ltd. All rights reserved.
 */
package abstractfactory;

/**
 * @author qibie
 * @createDate:2018-05-27
 * @ProjectName:designpattern
 */
public class ColorFactory extends AbstractFactory {
	public Shape getShape(String shapeType) {
		return null;
	}
	
	@Override
	public Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equals("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}
}
