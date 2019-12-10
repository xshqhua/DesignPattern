/**
 * @project DesignPattern
 * @package iterator_pattern
 * @filename PancakeHouseMenu.java
 */
package iterator_pattern3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月28日 下午10:14:06
 */
public class PancakeHouseMenu extends Menu{
	List menuItems;
	
	public PancakeHouseMenu(){
		menuItems = new ArrayList<>();
		addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
		addItem("Regular Pancake Breakfast", "Pancakes with fried eggs", false, 2.3);
		addItem("Blueberry Pancake Breakfast", "Pancakes with toast", true, 3.1);
		addItem("Waffles Pancake Breakfast", "scrambled eggs, and toast", true, 2.5);
		
	}
	public void addItem(String name,
			String description,
			boolean vegetarian,
			double price){
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
		
	}
	public Iterator<Object> createIterator(){
//		return new PancakeHouseMenuIterator(this.menuItems);
		return this.menuItems.iterator();
	}
	
	
}
