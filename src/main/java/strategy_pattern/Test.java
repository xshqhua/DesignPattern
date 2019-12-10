/**
 * @project DesignPattern
 * @package strategy_pattern
 * @filename Test.java
 */
package strategy_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月17日 下午9:42:14
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck d1 = new MallardDuck();
		d1.performQuack();
		d1.performFly();
		
		d1.setQuackBehavior(new QuackSilence());
		d1.setFlyBehavior(new FlyWithWings());
		d1.performQuack();
		d1.performFly();
		//d1.setQuackBehavior(quackBehavior);
	}

}
