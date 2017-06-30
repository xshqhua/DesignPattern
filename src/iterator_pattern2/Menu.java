/**
 * @project DesignPattern
 * @package iterator_pattern
 * @filename Menu.java
 */
package iterator_pattern2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月29日 下午4:19:19
 */
public class Menu extends MenuComponent{
	List menuComponents = new ArrayList<>();
	String name = "";
	String description = "";
	public Menu(String name,String description){
		this.description = description;
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see iterator_pattern2.MenuComponent#add(iterator_pattern2.MenuComponent)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void add(MenuComponent menuComponent) {
		// TODO Auto-generated method stub
		this.menuComponents.add(menuComponent);
	}
	/* (non-Javadoc)
	 * @see iterator_pattern2.MenuComponent#remove(iterator_pattern2.MenuComponent)
	 */
	@Override
	public void remove(MenuComponent menuComponent) {
		// TODO Auto-generated method stub
		this.menuComponents.remove(menuComponent);
	}
	/* (non-Javadoc)
	 * @see iterator_pattern2.MenuComponent#getChild(int)
	 */
	@Override
	public MenuComponent getChild(int i) {
		// TODO Auto-generated method stub
		return (MenuComponent)menuComponents.get(i);
	}
	/* (non-Javadoc)
	 * @see iterator_pattern2.MenuComponent#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	/* (non-Javadoc)
	 * @see iterator_pattern2.MenuComponent#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}/**
	 * 
	 */
	public Menu() {
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see iterator_pattern2.MenuComponent#print()
	 */
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("\n"+getName());
		System.out.println(","+getDescription());
		System.out.println("----------------------");
		
		Iterator iter = menuComponents.iterator();
		while(iter.hasNext()){
			MenuComponent menuComponent = (MenuComponent)iter.next();
			menuComponent.print();
		}
		
		
	}
}
