/**
 * @project DesignPattern
 * @package template_pattern
 * @filename Coffer.java
 */
package template_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月28日 下午6:50:51
 */
public class Coffer extends CaffeineBeverave{
	
	/* (non-Javadoc)
	 * @see template_pattern.CaffeineBeverave#brew()
	 */
	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Dripping coffee through filter");
	}

	/* (non-Javadoc)
	 * @see template_pattern.CaffeineBeverave#addCondiments()
	 */
	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding the Sugar and Milk");
		
	}

}
