package observable.diyinterface.observer;

/**
 * Observer
 * 
 * @author qibie
 * @date 2020/05/22
 */
public interface Observer {
	void update(float temp, float humidity, float pressure);
}
