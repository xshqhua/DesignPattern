/**
 * @project DesignPattern
 * @package strategy_pattern
 * @filename FlyWithWings.java
 */
package strategy_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月17日 下午9:51:27
 */
public class FlyWithWings implements FlyBehavior {

	/* (non-Javadoc)
	 * @see strategy_pattern.FlyBehavior#fly()
	 */
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I am fly with wings");
	}

}
