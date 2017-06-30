/**
 * @project DesignPattern
 * @package command_pattern
 * @filename SimpleRemoteControl1.java
 */
package command_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月19日 下午7:58:48
 */
public class SimpleRemoteControl1 {
	Command slot;
	public SimpleRemoteControl1(){}
	public void setCommand(Command command){
		slot = command;
	}
	public void butternWasPressed(){
		slot.execute();
	}
}
