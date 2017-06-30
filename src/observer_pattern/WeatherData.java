/**
 * @project DesignPattern
 * @package observer_pattern
 * @filename WeatherData.java
 */
package observer_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月18日 上午8:18:14
 */
public class WeatherData implements Subject{
	private List<Observer> observers;
	private float temperature = 0f;
	private float humidity = 0f;
	private float pressure = 0f;
	public WeatherData(){
		observers = new ArrayList<>();
	}
	public void measurementsChanged(){
		float temp = getTemperature();
		float humidity = getHumidity();
		float pressure = getPressure();
		this.notifyObserver();
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
	/* (non-Javadoc)
	 * @see observer_pattern.Subject#registerObserver()
	 */
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		this.observers.add(o);
	}
	/* (non-Javadoc)
	 * @see observer_pattern.Subject#removeObserver(observer_pattern.Observer)
	 */
	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		this.observers.remove(o);
	}
	/* (non-Javadoc)
	 * @see observer_pattern.Subject#notifyObserver()
	 */
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(int i=0;i<observers.size();i++){
			Observer o = observers.get(i);
			o.update(this.temperature, this.humidity, this.pressure);
		}
	}
	
	
	
}
