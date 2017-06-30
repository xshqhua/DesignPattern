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
public class Singleton6 {
	private static class LazyLoader{
		private static final Singleton6 INSTANCE = new Singleton6(); 
	}
	public static Singleton6 singleton = null;
	private Singleton6(){}
	public static final Singleton6 getInstance(){
		class LazyLoade{
			 public int a=1;
		}
		return LazyLoader.INSTANCE;
	}
}
