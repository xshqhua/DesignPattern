/**
 * @project DesignPattern
 * @package decorater_pattern
 * @filename Espress.java
 */
package decorater_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月18日 下午4:49:48
 */
public class Espress extends Beverage{
	public Espress() {
		// TODO Auto-generated constructor stub
		description = "Espress";
	}
	/* (non-Javadoc)
	 * @see decorater_pattern.Beverage#cost()
	 */
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}

}
