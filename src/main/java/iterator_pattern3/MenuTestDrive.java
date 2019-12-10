/**
 * @project DesignPattern
 * @package iterator_pattern
 * @filename Test.java
 */
package iterator_pattern3;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月28日 下午9:58:47
 */
public class MenuTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuComponent pancakeHouseMenu = 
				new Menu("Vegetaritan BLT", "Pancakes with scrambled eggs, and toast");
		MenuComponent dinnerMenu = 
				new Menu("Bacon", "Pancakes with fried eggs");
		MenuComponent cafeMenu = 
				new Menu("Soup", "Pancakes with toast");
		MenuComponent dessertMenu = 
				new Menu("Hotdog", "scrambled eggs, and toast");
		MenuComponent allMenus = 
				new Menu("All Menus", "All Menus combined");
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(cafeMenu);
		allMenus.add(dinnerMenu);
		
		dinnerMenu.add(new MenuItem(
				"Vegetaritan BLT", 
				"Pancakes with scrambled eggs, and toast", 
				true, 
				2.99));
		dinnerMenu.add(new MenuItem(
				"Bacon", 
				"Pancakes with fried eggs", 
				false, 
				2.3));
		dinnerMenu.add(dessertMenu);
		
		dessertMenu.add(new MenuItem(
				"Soup", 
				"Pancakes with toast", 
				true, 
				3.1));
		
		Waitress waitress = new Waitress(allMenus);
		waitress.prinMenu();
		
	}

}
