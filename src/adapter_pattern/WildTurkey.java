/**
 * @project DesignPattern
 * @package adapter_pattern
 * @filename WildTurkey.java
 */
package adapter_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月28日 下午2:42:45
 */
public class WildTurkey implements Turkey{

	/* (non-Javadoc)
	 * @see adapter_pattern.Turkey#fly()
	 */
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I am fly");
	}

	/* (non-Javadoc)
	 * @see adapter_pattern.Turkey#gooble()
	 */
	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		System.out.println("Gobble");
		
	}
	
}
