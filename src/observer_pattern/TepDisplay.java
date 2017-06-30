/**
 * @project DesignPattern
 * @package observer_pattern
 * @filename TepDisplay.java
 */
package observer_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月18日 下午1:17:22
 */
public class TepDisplay implements Display, Observer {
	private float temp = 0f;
	private float hum = 0f;
	private float press = 0f;
	private Subject weatherData;
	public TepDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	/* (non-Javadoc)
	 * @see observer_pattern.Observer#update(float, float, float)
	 */
	@Override
	public void update(float temp, float hum, float press) {
		// TODO Auto-generated method stub
		this.hum = hum;
		this.temp = temp;
		this.press = press;
		this.display();
	}

	/* (non-Javadoc)
	 * @see observer_pattern.Display#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("TepDisplay:\ntemperature:"+this.temp+"\thumidity:"+this.hum+"\tpressure:"+this.press);
	}

}
