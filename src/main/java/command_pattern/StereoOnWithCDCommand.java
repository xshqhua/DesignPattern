/**
 * @project DesignPattern
 * @package command_pattern
 * @filename StereoOnWithCDCommand.java
 */
package command_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月19日 下午8:46:14
 */
public class StereoOnWithCDCommand implements Command{
	StereoOnWithCD stereoOnWithCD;
	/**
	 * 
	 */
	public StereoOnWithCDCommand(StereoOnWithCD stereoOnWithCD) {
		// TODO Auto-generated constructor stub
		this.stereoOnWithCD = stereoOnWithCD;
	}
	/* (non-Javadoc)
	 * @see command_pattern.Command#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.stereoOnWithCD.on();
	}
	
}
