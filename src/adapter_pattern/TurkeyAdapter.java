/**
 * @project DesignPattern
 * @package adapter_pattern
 * @filename TurkeyAdapter.java
 */
package adapter_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月28日 下午2:45:50
 */
public class TurkeyAdapter implements Duck{
	Turkey turkey;
	/**
	 * 
	 */
	public TurkeyAdapter(Turkey turkey) {
		// TODO Auto-generated constructor stub
		this.turkey = turkey;
	}
	/* (non-Javadoc)
	 * @see adapter_pattern.Duck#fly()
	 */
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
			turkey.fly();
		
	}

	/* (non-Javadoc)
	 * @see adapter_pattern.Duck#quack()
	 */
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		turkey.gobble();
	}

}
