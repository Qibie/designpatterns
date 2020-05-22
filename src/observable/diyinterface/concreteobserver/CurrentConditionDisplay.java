package observable.diyinterface.concreteobserver;

import observable.diyinterface.concretesubject.WeatherData;
import observable.diyinterface.observer.Observer;
import observable.diyinterface.subject.DisplayElement;
import observable.diyinterface.subject.Subject;

/**
 * @author qibie
 * @date 2020/05/22
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;

	/**
	 * @param weatherData
	 */
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see observable.diyinterface.observer.Observer#update(float, float, float)
	 */
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see observable.diyinterface.subject.DisplayElement#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}
}
