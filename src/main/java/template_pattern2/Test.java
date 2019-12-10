/**
 * @project DesignPattern
 * @package template_pattern
 * @filename Test.java
 */
package template_pattern2;
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
		TeaWithHook myTea = new TeaWithHook();
		CofferWithHook coffee = new CofferWithHook();
		System.out.println("Making tea ...");
		myTea.prepareRecipe();
		
		System.out.println("Making coffee ...");
		coffee.prepareRecipe();
	}
}
