/**
 * @project DesignPattern
 * @package observer_pattern
 * @filename Test.java
 */
package observer_pattern2;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月18日 下午12:53:42
 */
public class Test {
	public static void main(String []args){
		WeatherData weatherData = new WeatherData();
		CurrentInfoDisplay currentInfoDisplay = new CurrentInfoDisplay(weatherData);
		TepDisplay tepDisplay = new TepDisplay(weatherData);
		//currentInfoDisplay.display();
		weatherData.setMeasurement(30, 20, 10);
		System.out.println("-----remove------");
		weatherData.deleteObserver(currentInfoDisplay);
		weatherData.setMeasurement(20, 10, 10);
		//currentInfoDisplay.display();
	}
	
}
