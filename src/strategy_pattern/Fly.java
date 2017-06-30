/**
 * @project DesignPattern
 * @package strategy_pattern
 * @filename Fly.java
 */
package strategy_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月17日 下午4:30:10
 */
public class Fly implements FlyBehavior {

	/* (non-Javadoc)
	 * @see strategy_pattern.FlyBehavior#fly()
	 */
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("fly");
	}

}
