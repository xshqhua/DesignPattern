/**
 * @project DesignPattern
 * @package command_pattern
 * @filename LinghtOnCommand.java
 */
package command_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月19日 下午7:55:18
 */
public class LightOnCommand implements Command{
	public Light light;
	public LightOnCommand(Light light) {
		// TODO Auto-generated constructor stub
		this.light = light;
	}
	/* (non-Javadoc)
	 * @see command_pattern.Command#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.light.on();
	}

}
