/**
 * @project DesignPattern
 * @package observer_pattern
 * @filename TepDisplay.java
 */
package observer_pattern2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月18日 下午1:17:22
 */
public class TepDisplay implements Display, Observer {
	private float temp = 0f;
	private float hum = 0f;
	private float press = 0f;
	private Observable observable;
	public TepDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	
	/* (non-Javadoc)
	 * @see observer_pattern.Display#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("TepDisplay:\ntemperature:"+this.temp+"\thumidity:"+this.hum+"\tpressure:"+this.press);
	}

	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof WeatherData){
			WeatherData we = (WeatherData)o;
			this.temp = we.getTemperature();
			this.hum = we.getHumidity();
			this.press = 0f;
			this.display();
			if(arg!=null)
				System.out.println(arg.toString());
		}
	}

}
