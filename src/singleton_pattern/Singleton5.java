/**
 * @project DesignPattern
 * @package singleton_pattern
 * @filename Singleton5.java
 */
package singleton_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月19日 下午4:52:10
 */
public class Singleton5 {
	private static class LazyLoader{
		private static final Singleton5 INSTANCE = new Singleton5(); 
	}
	public static Singleton5 singleton = null;
	private Singleton5(){}
	public static final Singleton5 getInstance(){
		return LazyLoader.INSTANCE;
	}
}
