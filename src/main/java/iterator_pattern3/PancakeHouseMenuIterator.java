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
public class PancakeHouseMenuIterator implements Iterator<Object>{
	List menuItems = new ArrayList<>();
	int position = 0;
	public PancakeHouseMenuIterator(List menuItems){
		this.menuItems = menuItems;
		
	}
	/* (non-Javadoc)
	 * @see java.util.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position>=menuItems.size()||menuItems.get(position)==null)
			return false;
		else {
			return true;
		}
	}
	/* (non-Javadoc)
	 * @see java.util.Iterator#next()
	 */
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		
		return menuItems.get(position++);
	}
	
	
}
