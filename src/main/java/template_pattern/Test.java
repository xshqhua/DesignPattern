/**
 * @project DesignPattern
 * @package template_pattern
 * @filename Test.java
 */
package template_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月28日 下午7:19:15
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test().init();
	}
	public void init(){
		Tea myTea = new Tea();
		myTea.prepareRecipe();
	}
}
