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
public class RemoteControl1 {
	Command []onCommands;
	Command []offCommands;
	public RemoteControl1(){
		onCommands = new Command[7];
		offCommands = new Command[7];
		Command noCommand = NoCommand.getInstance();
		for(int i=0;i<onCommands.length;i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
			
	}
	public void setCommand(int slot,Command onCommand,Command offCommand){
		this.onCommands[slot] = onCommand;
		this.offCommands[slot] = offCommand;
		
	}
	public void onButternWasPushed(int slot){
		this.onCommands[slot].execute();
	}
	public void offButternWasPushed(int slot){
		this.offCommands[slot].execute();
	}
	
	public void butternWasPush(){
		NoCommand noCommand = NoCommand.getInstance();
		for(int i=0;i<onCommands.length;i++){
			if(onCommands[i]!=noCommand){
				onButternWasPushed(i);
			}
			if(offCommands[i]!=noCommand){
				offButternWasPushed(i);
			}
		}
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("\n---------Remote----------\n");
		for(int i=0;i<this.onCommands.length;i++){
			sb.append("[slot "+i+"] "+onCommands[i].getClass().getName()+"\t\t"
		+offCommands[i].getClass().getName()+"\n");
			
		}
		
		return sb.toString();
	}
	
	
	
}
