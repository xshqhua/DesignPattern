/**
 * @project DesignPattern
 * @package template_pattern
 * @filename Coffer.java
 */
package template_pattern2;

import java.util.Scanner;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月28日 下午6:50:51
 */
public class CofferWithHook extends CaffeineBeveraveWithHook{
	
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
	public boolean customerWantsCondiments(){
		String answer = getUserInput();
		if(answer.trim().startsWith("Y")||answer.trim().startsWith("y"))
			return true;
		return false;
	}
	public String getUserInput(){
		String resString = null;
		System.out.println("Would you like lemon with your tea (y/n) ?");
		Scanner scanner = new Scanner(System.in);
		resString = scanner.nextLine();
		if (resString == null) {
			return "no";
		}
		return resString;
	}

}
