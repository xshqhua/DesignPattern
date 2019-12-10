/**
 * @project DesignPattern
 * @package template_pattern
 * @filename CaffeineBeverave.java
 */
package template_pattern2;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月28日 下午6:52:09
 */
public abstract class CaffeineBeveraveWithHook {
	abstract void brew();
	abstract void addCondiments();
	
	public void prepareRecipe(){
		boidWater();
		brew();
		pourInCup();
		if(customerWantsCondiments())
			addCondiments();
	}
	public void boidWater(){
		System.out.println("Boiling the water");
	}
	public void pourInCup(){
		System.out.println("Pouring in the cup");
		
	}
	public boolean customerWantsCondiments(){
		return true;
	} 
}
