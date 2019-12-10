/**
 * @project DesignPattern
 * @package iterator_pattern
 * @filename DinerMenu.java
 */
package iterator_pattern3;

import java.util.Iterator;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月28日 下午10:30:53
 */
public class DinerMenu extends Menu{
	static final int MAX_ITEMS = 6;
	int numberOfItem = 0;
	MenuItem[] menuItems;
	public DinerMenu(){
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("Vegetaritan BLT", "Pancakes with scrambled eggs, and toast", true, 2.99);
		addItem("Bacon", "Pancakes with fried eggs", false, 2.3);
		addItem("Soup", "Pancakes with toast", true, 3.1);
		addItem("Hotdog", "scrambled eggs, and toast", true, 2.5);
	}
	public void addItem(String name,
			String description,
			boolean vegetarian,
			double price){
		if(numberOfItem>MAX_ITEMS){
			System.out.println("Out of MenuItem is full;");
			return;
		}
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems[numberOfItem] = menuItem;
		numberOfItem+=1;
	}
	public Iterator<Object> createIterator(){
		return new DinerMenuIterator(menuItems);
	}
}
