/**
 * @project DesignPattern
 * @package factory_pattern
 * @filename Pizza.java
 */
package factory_pattern;

import java.util.ArrayList;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月18日 下午8:42:57
 */
public abstract class Pizza {
	public String name = "";
	public String dough = "";
	public String sauce = "";
	public ArrayList<String> topping = new ArrayList<>();
	
	/**
	 * 
	 */
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("Pizza is ok! And start box.");
	}

	/**
	 * 
	 */
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("Pizza start cut.");
	}

	/**
	 * 
	 */
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("Pizza start bake.");
	}

	/**
	 * 
	 */
	public abstract void prepare() ;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dough
	 */
	public String getDough() {
		return dough;
	}

	/**
	 * @param dough the dough to set
	 */
	public void setDough(String dough) {
		this.dough = dough;
	}

	/**
	 * @return the sauce
	 */
	public String getSauce() {
		return sauce;
	}

	/**
	 * @param sauce the sauce to set
	 */
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	/**
	 * @return the topping
	 */
	public ArrayList<String> getTopping() {
		return topping;
	}

	/**
	 * @param topping the topping to set
	 */
	public void setTopping(ArrayList<String> topping) {
		this.topping = topping;
	} 
	



}
