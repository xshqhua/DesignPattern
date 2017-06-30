/**
 * @project DesignPattern
 * @package observer_pattern
 * @filename WeatherData.java
 */
package observer_pattern2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月18日 上午8:18:14
 */
public class WeatherData extends Observable{
	private float temperature = 0f;
	private float humidity = 0f;
	private float pressure = 0f;
	public WeatherData(){}
	public void measurementsChanged(){
		float temp = getTemperature();
		float humidity = getHumidity();
		float pressure = getPressure();
		setChanged();
		//notifyObservers();
		notifyObservers("tt");
		//notifyAll();
	}
	public void setMeasurement(float temp,float hum,float press){
		this.temperature = temp;
		this.humidity = hum;
		this.pressure = press;
		this.measurementsChanged();
	} 
	/**
	 * @return the temp
	 */
	public float getTemperature() {
		return temperature;
	}
	/**
	 * @param temp the temp to set
	 */
	public void setTemperature(float temperature) {
		this.temperature = temperature;
		setMeasurement(this.temperature,this.humidity,this.temperature);
	}
	/**
	 * @return the hunmidity
	 */
	public float getHumidity() {
		return humidity;
	}
	/**
	 * @param hunmidity the hunmidity to set
	 */
	public void setHumidity(float humidity) {
		this.humidity = humidity;
		setMeasurement(this.temperature,this.humidity,this.temperature);
	}
	/**
	 * @return the pressure
	 */
	public float getPressure() {
		return pressure;
	}
	/**
	 * @param pressure the pressure to set
	 */
	public void setPressure(float pressure) {
		this.pressure = pressure;
		setMeasurement(this.temperature,this.humidity,this.temperature);
	}
}
