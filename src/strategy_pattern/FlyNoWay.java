/**
 * @project DesignPattern
 * @package strategy_pattern
 * @filename FlyNoWay.java
 */
package strategy_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月17日 下午9:35:20
 */
public class FlyNoWay implements FlyBehavior {

	/* (non-Javadoc)
	 * @see strategy_pattern.FlyBehavior#fly()
	 */
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I am not fly!");
	}

}
