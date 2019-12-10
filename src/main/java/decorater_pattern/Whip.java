/**
 * @project DesignPattern
 * @package decorater_pattern
 * @filename Whip.java
 */
package decorater_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月18日 下午5:12:16
 */
public class Whip extends CondimentDecorator{
	public Beverage beverage;
	/**
	 * 
	 */
	public Whip(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	/* (non-Javadoc)
	 * @see decorater_pattern.CondimentDecorator#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+",Whip";
	}

	/* (non-Javadoc)
	 * @see decorater_pattern.Beverage#cost()
	 */
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+1.2;
	}

}
