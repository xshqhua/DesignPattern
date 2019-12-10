/**
 * @project DesignPattern
 * @package template_pattern
 * @filename Tea.java
 */
package template_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月28日 下午6:51:05
 */
public class Tea extends CaffeineBeverave{

	/* (non-Javadoc)
	 * @see template_pattern.CaffeineBeverave#brew()
	 */
	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Steep the tea");
	}

	/* (non-Javadoc)
	 * @see template_pattern.CaffeineBeverave#addCondiments()
	 */
	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding Lemon");
		
	}

}
