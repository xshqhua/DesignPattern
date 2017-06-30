/**
 * @project DesignPattern
 * @package singleton_pattern
 * @filename Test.java
 */
package singleton_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月19日 下午4:29:10
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test().init();
	}


	private void init() {
		// TODO Auto-generated method stub
		singleton1();
		System.out.println("===============");
		singleton2();
		System.out.println("===============");
		singleton3();
		System.out.println("===============");
		singleton4();
		System.out.println("===============");
		singleton5();
	}
	public void singleton5() {
		Singleton5 s1 = Singleton5.getInstance();
		Singleton5 s2 = Singleton5.getInstance();
		if(s1==s2){
			System.out.println("union singleton Singleton5");
		}
	}
	public void singleton4() {
		Singleton4 s1 = Singleton4.getInstance();
		Singleton4 s2 = Singleton4.getInstance();
		if(s1==s2){
			System.out.println("union singleton Singleton4");
		}
	}
	public void singleton3() {
		Singleton3 s1 = Singleton3.getInstance();
		s1.setName("S1");
		System.out.println(s1.getName());
		Singleton3 s2 = Singleton3.getInstance();
		s2.setName("s2");
		System.out.println(s2.getName());
		if(s1==s2){
			System.out.println("union singleton Singleton3");
		}
	}

	public void singleton2() {
		Singleton2 s1 = Singleton2.getInstance();
		s1.setName("S1");
		System.out.println(s1.getName());
		Singleton2 s2 = Singleton2.getInstance();
		s2.setName("s2");
		System.out.println(s2.getName());
		if(s1==s2){
			System.out.println("union singleton Singleton2");
		}
	}

	public void singleton1() {
		Singleton1 s1 = Singleton1.getInstance();
		s1.setName("S1");
		System.out.println(s1.getName());
		Singleton1 s2 = Singleton1.getInstance();
		s2.setName("s2");
		System.out.println(s2.getName());
		if(s1==s2){
			System.out.println("union singleton Singleton1");
		}
	}

}
