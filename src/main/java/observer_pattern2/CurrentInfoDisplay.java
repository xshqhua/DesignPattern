/**
 * @project DesignPattern
 * @package observer_pattern
 * @filename CurrentInfoDisplay.java
 */
package observer_pattern2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月18日 上午9:07:14
 */
public class CurrentInfoDisplay implements Display, Observer {
	private float temperature = 0f;
	private float humidity = 0f;
	private float pressure = 0f;
	private Observable observable;
	public CurrentInfoDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	
	/* (non-Javadoc)
	 * @see observer_pattern.Display#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("CurrentInfo:\ntemperature:"+this.temperature+"\thumidity:"+this.humidity+"\tpressure:"+this.pressure);
	}
	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof WeatherData){
			WeatherData we = (WeatherData) o;
			this.temperature = we.getTemperature();
			this.humidity = we.getHumidity();
			this.pressure = we.getPressure();
			this.display();
		}
		
	}

}
