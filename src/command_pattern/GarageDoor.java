/**
 * @project DesignPattern
 * @package command_pattern
 * @filename GarageDoor.java
 */
package command_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月19日 下午8:07:52
 */
public class GarageDoor {
	public void up(){
		System.out.println("Garage Door is open!");
	}
	public void close(){
		System.out.println("Garage Door is close!");
	}
	public void stop(){
		System.out.println("Garage Door is stop!");
	}
}
