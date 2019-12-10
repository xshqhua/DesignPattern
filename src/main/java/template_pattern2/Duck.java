/**
 * @project DesignPattern
 * @package template_pattern2
 * @filename Duck.java
 */
package template_pattern2;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月28日 下午9:07:35
 */
public class Duck implements Comparable<Object> {
    String name = "";
    int weight = 0;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return this.name + " weight " + this.weight;
    }

    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        Duck otherDuck = (Duck) o;
        if (this.weight < otherDuck.weight)
            return -1;
        else if (this.weight == otherDuck.weight)
            return 0;
        else
            return 1;
    }

}
