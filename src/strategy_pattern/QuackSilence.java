/**
 * @project DesignPattern
 * @package strategy_pattern
 * @filename QuackSilence.java
 */
package strategy_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月17日 下午9:56:27
 */
public class QuackSilence implements QuackBehavior {

	/* (non-Javadoc)
	 * @see strategy_pattern.QuackBehavior#quack()
	 */
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("quack silencce");
	}
	
}
