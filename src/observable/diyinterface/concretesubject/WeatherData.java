package observable.diyinterface.concretesubject;

import java.util.ArrayList;

import observable.diyinterface.observer.Observer;
import observable.diyinterface.subject.Subject;

/**
 * @author qibie
 * @date 2020/05/22
 */
public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	/*
	 * (non-Javadoc)
	 * 
	 * @see observable.diyinterface.subject.Subject#registerObserver(observable.
	 * diyinterface.subject.Observer)
	 */
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see observable.diyinterface.subject.Subject#removeObserver(observable.
	 * diyinterface.subject.Observer)
	 */
	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see observable.diyinterface.subject.Subject#notifyObserver()
	 */
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}

	public void measurementChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}
}
