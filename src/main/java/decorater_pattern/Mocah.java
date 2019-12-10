/**
 * @project DesignPattern
 * @package decorater_pattern
 * @filename Mocah.java
 */
package decorater_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月18日 下午4:54:11
 */
public class Mocah extends CondimentDecorator{
	public Beverage beverage;
	/**
	 * 
	 */
	public Mocah(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	/* (non-Javadoc)
	 * @see decorater_pattern.CondimentDecorator#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+",Mocha";
	}

	/* (non-Javadoc)
	 * @see decorater_pattern.Beverage#cost()
	 */
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost()+2.0;
	}

}
