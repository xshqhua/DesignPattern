/**
 * @project DesignPattern
 * @package decorater_pattern
 * @filename Beverage.java
 */
package decorater_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月18日 下午4:43:23
 */
public abstract class Beverage {
	public String description = "";
	public abstract double cost();
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	} 
}
