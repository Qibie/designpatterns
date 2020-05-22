package observable.diyinterface.subject;

import observable.diyinterface.observer.Observer;

/**
 * subject interface
 * 
 * @author qibie
 * @date 2020/05/22
 */
public interface Subject {
	void registerObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObservers();
}
