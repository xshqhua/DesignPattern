/**
 * @project DesignPattern
 * @package command_pattern
 * @filename LightOffCommand.java
 */
package command_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月19日 下午8:40:42
 */
public class LightOffCommand implements Command{
	Light light;
	public LightOffCommand(Light light){
		this.light = light; 
	}
	
	/* (non-Javadoc)
	 * @see command_pattern.Command#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.light.off();
	}

}
