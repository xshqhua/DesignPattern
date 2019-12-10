/**
 * @project DesignPattern
 * @package command_pattern
 * @filename GarageDoorCloseCommand.java
 */
package command_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月19日 下午8:13:55
 */
public class GarageDoorCloseCommand implements Command{
	GarageDoor door;
	/**
	 * 
	 */
	public GarageDoorCloseCommand(GarageDoor door) {
		// TODO Auto-generated constructor stub
		this.door = door;
	}
	/* (non-Javadoc)
	 * @see command_pattern.Command#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		door.close();
	}

}
