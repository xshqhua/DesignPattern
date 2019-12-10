/**
 * @project DesignPattern
 * @package template_pattern
 * @filename CaffeineBeverave.java
 */
package template_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月28日 下午6:52:09
 */
public abstract class CaffeineBeverave {
	abstract void brew();
	abstract void addCondiments();
	
	public void prepareRecipe(){
		boidWater();
		brew();
		pourInCup();
		addCondiments();
	}
	public void boidWater(){
		System.out.println("Boiling the water");
	}
	public void pourInCup(){
		System.out.println("Pouring in the cup");
		
	}
}
