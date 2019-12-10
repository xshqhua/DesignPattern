/**
 * @project DesignPattern
 * @package decorater_pattern
 * @filename HouseBlend.java
 */
package decorater_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月18日 下午4:51:51
 */
public class HouseBlend extends Beverage{
	public HouseBlend() {
		// TODO Auto-generated constructor stub
		description = "House Blend Coffee";
	}
	/* (non-Javadoc)
	 * @see decorater_pattern.Beverage#cost()
	 */
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .89;
	}

}
