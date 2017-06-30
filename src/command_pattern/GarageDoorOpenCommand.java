/**
 * @project DesignPattern
 * @package command_pattern
 * @filename GarageDoorOpenCommand.java
 */
package command_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月19日 下午8:06:43
 */
public class GarageDoorOpenCommand implements Command{
	GarageDoor door;
	public GarageDoorOpenCommand(GarageDoor door ){
		this.door = door;
	}
	/* (non-Javadoc)
	 * @see command_pattern.Command#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.door.up();
	}
	
}
