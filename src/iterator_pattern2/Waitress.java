/**
 * @project DesignPattern
 * @package iterator_pattern
 * @filename Waitress.java
 */
package iterator_pattern2;

import java.util.Iterator;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月29日 下午3:53:22
 */
public class Waitress {
	MenuComponent allMenus;
	Menu dinerMenu;
	/**
	 * 
	 */
	public Waitress(MenuComponent allMenus) {
		// TODO Auto-generated constructor stub
		this.allMenus = allMenus;
	}
	@SuppressWarnings("unchecked")
	public void prinMenu(){
		allMenus.print();
	}
}
