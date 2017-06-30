/**
 * @project DesignPattern
 * @package observer_pattern
 * @filename CurrentInfoDisplay.java
 */
package observer_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月18日 上午9:07:14
 */
public class CurrentInfoDisplay implements Display, Observer {
	private float temperature = 0f;
	private float humidity = 0f;
	private float pressure = 0f;
	private Subject weatherData;
	public CurrentInfoDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	/* (non-Javadoc)
	 * @see observer_pattern.Observer#update(float, float, float)
	 */
	@Override
	public void update(float temp, float hum, float press) {
		// TODO Auto-generated method stub
		this.temperature = temp;
		this.humidity = hum;
		this.pressure = press;
		this.display();
	}
	/* (non-Javadoc)
	 * @see observer_pattern.Display#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("CurrentInfo:\ntemperature:"+this.temperature+"\thumidity:"+this.humidity+"\tpressure:"+this.pressure);
	}

}
