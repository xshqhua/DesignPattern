/**
 * @project DesignPattern
 * @package decorater_pattern
 * @filename Test.java
 */
package decorater_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月18日 下午4:57:37
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverage = new Espress();
		System.out.println(beverage.getDescription()+"\t$"+beverage.cost());

		Beverage beverage2 = new Espress();
		beverage2 = new Mocah(beverage2);
		beverage2 = new Mocah(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription()+"\t$"+beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Mocah(beverage3);
		System.out.println(beverage3.getDescription()+"\t$"+beverage3.cost());
	}

}
