/**
 * @project DesignPattern
 * @package iterator_pattern
 * @filename DinerMenuIterator.java
 */
package iterator_pattern3;

import java.util.Iterator;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月29日 下午3:38:33
 */
public class DinerMenuIterator implements Iterator<Object>{
	MenuItem[] items;
	int position = 0;
	/**
	 * 
	 */
	public DinerMenuIterator(MenuItem[] items) {
		// TODO Auto-generated constructor stub
		this.items = items;
	}
	/* (non-Javadoc)
	 * @see java.util.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(this.items.length<=position||this.items[position]==null)
			return false;
		else
			return true;
	}
	/* (non-Javadoc)
	 * @see java.util.Iterator#next()
	 */
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		MenuItem item = items[position++];
		return item;
	}
	
}
