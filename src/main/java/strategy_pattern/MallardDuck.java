/**
 * @project DesignPattern
 * @package strategy_pattern
 * @filename MallardDuck.java
 */
package strategy_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月17日 下午9:45:08
 */
public class MallardDuck extends Duck {
	public MallardDuck(){
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new Quack();
	}
	
}
