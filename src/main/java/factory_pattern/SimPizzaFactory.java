/**
 * @project DesignPattern
 * @package factory_pattern
 * @filename SimPizzaFactory.java
 */
package factory_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月18日 下午8:39:57
 */
public class SimPizzaFactory {
	public static Pizza createPizza(String type){
		Pizza pizza = null;
		if(type.equals("cheese")){
			pizza = new Cheese();
		}else if(type.equals("greek")){
			pizza = new Greek();
			
		}else if(type.equals("pepperoni")){
			pizza = new Pepperoni();
			
		}
		
		return pizza;
	}
}
