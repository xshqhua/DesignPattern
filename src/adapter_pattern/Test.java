/**
 * @project DesignPattern
 * @package adapter_pattern
 * @filename Test.java
 */
package adapter_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月28日 下午3:00:55
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
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		System.out.println("The turkey says...");
		turkey.fly();
		turkey.gobble();
		System.out.println("The duck says...");
		testDuck(duck);
		System.out.println("The duck says...");
		testDuck(turkeyAdapter);
	}
	public void testDuck(Duck duck){
		duck.fly();
		duck.quack();
	}

}
