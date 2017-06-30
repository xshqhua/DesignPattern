/**
 * @project DesignPattern
 * @package adapter_pattern
 * @filename MallardDuck.java
 */
package adapter_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月28日 下午2:40:38
 */
public class MallardDuck implements Duck{

	/* (non-Javadoc)
	 * @see adapter_pattern.Duck#fly()
	 */
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I am fly!");
	}

	/* (non-Javadoc)
	 * @see adapter_pattern.Duck#quack()
	 */
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Quack");
	}
	
}
