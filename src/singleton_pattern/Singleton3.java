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
public class Singleton3 {
	public static Singleton3 singleton = null;
	public String name = "";
	private Singleton3() {}
	public static Singleton3 getInstance(){
		if(singleton==null){
			synchronized(Singleton3.class){
				if(singleton==null){
					singleton = new Singleton3(); 
				}
			}
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
