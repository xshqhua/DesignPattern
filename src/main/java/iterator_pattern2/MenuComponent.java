/**
 * @project DesignPattern
 * @package iterator_pattern
 * @filename MenuComponent.java
 */
package iterator_pattern2;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月29日 下午7:25:37
 */
public abstract class MenuComponent {
	public void add(MenuComponent menuComponent){
		throw new UnsupportedOperationException();
	}
	public void remove(MenuComponent menuComponent){
		throw new UnsupportedOperationException();
	}
	public MenuComponent getChild(int i){
		throw new UnsupportedOperationException();
	}
	public String getName() {
		throw new UnsupportedOperationException();
	}
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	public void print() {
		throw new UnsupportedOperationException();
	}
}
