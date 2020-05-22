package observable.diyinterface;

import observable.diyinterface.concreteobserver.CurrentConditionDisplay;
import observable.diyinterface.concretesubject.WeatherData;

/**
 * @author qibie
 * @date 2020/05/22
 */
public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay currentConditionDisplay =
				new CurrentConditionDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}

}
