/**
 * @project DesignPattern
 * @package factory_pattern
 * @filename NYPizzaStore.java
 */
package factory_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月18日 下午8:48:26
 */
public class NYPizzaStore extends PizzaStore{
	
	/* (non-Javadoc)
	 * @see factory_pattern.PizzaStore#createPizza(java.lang.String)
	 */
	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = SimPizzaFactory.createPizza(type);
		
		return pizza;
	}

}
