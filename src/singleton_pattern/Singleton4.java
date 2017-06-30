/**
 * @project DesignPattern
 * @package singleton_pattern
 * @filename Singleton.java
 */
package singleton_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月19日 下午4:47:56
 */
public class Singleton4 {
	public static final Singleton4 singleton = new Singleton4();
	private Singleton4(){};
	public static Singleton4 getInstance(){
		return singleton;
	}
	
}
