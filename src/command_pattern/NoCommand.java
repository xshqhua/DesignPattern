/**
 * @project DesignPattern
 * @package command_pattern
 * @filename NoCommand.java
 */
package command_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月19日 下午8:27:03
 */
public class NoCommand implements Command{
	private static class LazyLoader{
		private static NoCommand NOCOMMAND = new NoCommand();
	}
	public static final NoCommand getInstance(){
		return LazyLoader.NOCOMMAND;
	}
	private NoCommand() {
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see command_pattern.Command#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("No Command!");
	}

}
