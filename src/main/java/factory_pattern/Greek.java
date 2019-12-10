/**
 * @project DesignPattern
 * @package factory_pattern
 * @filename Greek.java
 */
package factory_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月18日 下午8:38:43
 */
public class Greek extends Pizza {

	/* (non-Javadoc)
	 * @see factory_pattern.Pizza#prepare()
	 */
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Pizza start prepare.");
		System.out.println("Prepare "+name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		for(int i=0;i<topping.size();i++){
			System.out.println("\t"+topping.get(i));
		}
	}
	
}
