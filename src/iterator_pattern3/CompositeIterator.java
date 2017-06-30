/**
 * @project DesignPattern
 * @package iterator_pattern3
 * @filename CompositeIterator.java
 */
package iterator_pattern3;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月29日 下午8:58:28
 */
public class CompositeIterator implements Iterator{
	Stack<Object> stack = new Stack<>();
	public CompositeIterator(Iterator iterator){
		stack.push(iterator);
	}
	/* (non-Javadoc)
	 * @see java.util.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(stack.isEmpty()){
			return false;
		}else {
			Iterator<?> iterator = (Iterator<?>) stack.peek();
			if(!iterator.hasNext()){
				stack.pop();
				return hasNext();
			}else {
				return true;
			}
		}
	}
	/* (non-Javadoc)
	 * @see java.util.Iterator#next()
	 */
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		if(hasNext()){
			Iterator<?> iterator = (Iterator<?>) stack.peek();
			MenuComponent component = (MenuComponent) iterator.next();
			if(component instanceof Menu){
				stack.push(((Menu) component).createIterator());
			}else {
				return null;
			}
			
			
		}
		return null;
	}
	public void remove(){
		throw new UnsupportedOperationException();
	}

}
