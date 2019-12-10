/**
 * @project DesignPattern
 * @package observer_pattern
 * @filename Subject.java
 */
package observer_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月18日 上午8:45:09
 */
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
}
