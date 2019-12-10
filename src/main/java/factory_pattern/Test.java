/**
 * @project DesignPattern
 * @package factory_pattern
 * @filename Test.java
 */
package factory_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月18日 下午5:24:32
 */
public class Test{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore ps = new NYPizzaStore();
		
		Pizza pizza = ps.orderPizza("cheese");
		System.out.println();
		
	}

}
