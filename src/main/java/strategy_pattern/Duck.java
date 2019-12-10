/**
 * @project DesignPattern
 * @package strategy_pattern
 * @filename Duck.java
 */
package strategy_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月17日 下午4:16:56
 */
public abstract class Duck {
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	public Duck(){}
	public void performFly(){
		flyBehavior.fly();
	}
	public void performQuack(){
		quackBehavior.quack();
	}
	/**
	 * @return the flyBehavior
	 */
	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}
	/**
	 * @param flyBehavior the flyBehavior to set
	 */
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	/**
	 * @return the quackBehavior
	 */
	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}
	/**
	 * @param quackBehavior the quackBehavior to set
	 */
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
}
