/**
 * @project DesignPattern
 * @package singleton_pattern
 * @filename Singleton1.java
 */
package singleton_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月19日 下午4:27:20
 */
public class Singleton1 {
	public static Singleton1 singleton = null;
	public String name = "";
	private Singleton1(){}
	public static Singleton1 getInstance(){
		if(singleton==null){
			singleton = new Singleton1();
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
