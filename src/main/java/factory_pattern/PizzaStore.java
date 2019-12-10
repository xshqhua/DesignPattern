/**
 * @project DesignPattern
 * @package factory_pattern
 * @filename Pizza.java
 */
package factory_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月18日 下午8:31:11
 */
public abstract class PizzaStore {
	public Pizza orderPizza(String type){
		Pizza pizza;
		
		pizza = createPizza(type);
		
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		
		
		return pizza;
		
	}
	public abstract Pizza createPizza(String type);

}
