/**
 * @project DesignPattern
 * @package iterator_pattern
 * @filename Waitress.java
 */
package iterator_pattern;

import java.util.Iterator;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月29日 下午3:53:22
 */
public class Waitress {
	Menu pancakeHouseMenu;
	Menu dinerMenu;
	/**
	 * 
	 */
	public Waitress(Menu pancakeHouseMenu,Menu dinerMenu) {
		// TODO Auto-generated constructor stub
		this.dinerMenu = dinerMenu;
		this.pancakeHouseMenu = pancakeHouseMenu;
	}
	@SuppressWarnings("unchecked")
	public void prinMenu(){
		Iterator<Object> iterator1 = this.pancakeHouseMenu.createIterator(); 
		Iterator<Object> iterator2 = this.dinerMenu.createIterator();
		System.out.println("pancakeHouseMenu");
		printMenu(iterator1);
		System.out.println("dinerMenu");
		printMenu(iterator2);
	}
	private void printMenu(Iterator<Object> iterator){
		while(iterator.hasNext()){
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println(menuItem.getName()+","+menuItem.getPrice()+"---"+menuItem.getDescription());
		}
	}
}
