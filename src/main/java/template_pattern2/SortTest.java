/**
 * @project DesignPattern
 * @package template_pattern2
 * @filename SortTest.java
 */
package template_pattern2;

import java.util.Arrays;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月28日 下午9:21:49
 */
public class SortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck [] ducks = new Duck[]{
				new Duck("Daffy2", 8),
				new Duck("Daffy3", 18),
				new Duck("Daffy5", 81),
				new Duck("Daffy1", 28),
				new Duck("Daffy8", 88),
				new Duck("Daffy4", 68),
		};
		
		System.out.println("Before sorting:");
		display(ducks);
		System.out.println("After sorting:");
		Arrays.sort(ducks);
		display(ducks);
	}
	public static void display(Duck []ds){
		for(int i=0;i<ds.length;i++){
			System.out.println(ds[i].toString());
		}
	}

}
