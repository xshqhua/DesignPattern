/**
 * @project DesignPattern
 * @package observer_pattern
 * @filename Observer.java
 */
package observer_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月18日 上午8:47:24
 */
public interface Observer {
	public void update(float temp,float hum,float press);
}
