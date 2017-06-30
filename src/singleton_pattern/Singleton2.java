/**
 * @project DesignPattern
 * @package singleton_pattern
 * @filename Singleton2.java
 */
package singleton_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月19日 下午4:39:14
 */
public class Singleton2 {
	public static Singleton2 singleton = null;
	public String name = "";
	private Singleton2() {}
	public static synchronized Singleton2 getInstance(){
		if(singleton==null){
			singleton = new Singleton2(); 
		}
		return singleton;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
