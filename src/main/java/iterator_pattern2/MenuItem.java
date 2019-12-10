/**
 * @project DesignPattern
 * @package iterator_pattern
 * @filename menuItem.java
 */
package iterator_pattern2;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月28日 下午10:07:25
 */
public class MenuItem extends MenuComponent{
	String name = "";
	String description = "";
	boolean vegetarian;
	double price;
	public MenuItem(String name,
			String description,
			boolean vegetarian,
			double price){
		this.description = description;
		this.name = name;
		this.price = price;
		this.vegetarian = vegetarian;
	}
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the vegetarian
	 */
	public boolean isVegetarian() {
		return vegetarian;
	}
	/**
	 * @param vegetarian the vegetarian to set
	 */
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	public void print(){
		System.out.print(" "+getName());
		if(isVegetarian())
			System.out.print("(V)");
		System.out.println(","+getPrice());
		System.out.println("   ---"+getDescription());
	}
}
