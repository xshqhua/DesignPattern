/**
 * @project DesignPattern
 * @package command_pattern
 * @filename Test.java
 */
package command_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月19日 下午7:48:16
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.simpleRemoteControl();
		System.out.println("============================");
		test.remoteControl();
	}
	public void remoteControl() {
		// TODO Auto-generated method stub
		Light light = new Light();
		LightOffCommand lightOff = new LightOffCommand(light);
		LightOnCommand lightOn = new LightOnCommand(light);
		
		GarageDoor door = new GarageDoor();
		GarageDoorCloseCommand doorClose = new GarageDoorCloseCommand(door);
		GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(door);
		
		StereoOnWithCD stereo = new StereoOnWithCD();
		StereoOffWithCDCommand stereoOff = new StereoOffWithCDCommand(stereo);
		StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
		
		RemoteControl1 remoteControl1 = new RemoteControl1();
		remoteControl1.setCommand(0, stereoOn, stereoOff);
		remoteControl1.setCommand(1, doorOpen, doorClose);
		remoteControl1.setCommand(2, lightOn, lightOff);
		System.out.println(remoteControl1);
		System.out.println("=====use Singleton=====");
		remoteControl1.butternWasPush();
		System.out.println("=========================");
		remoteControl1.onButternWasPushed(0);
		remoteControl1.offButternWasPushed(0);
		remoteControl1.onButternWasPushed(1);
		remoteControl1.offButternWasPushed(1);
		remoteControl1.onButternWasPushed(2);
		remoteControl1.offButternWasPushed(2);
		
	}
	public  void simpleRemoteControl() {
		SimpleRemoteControl1 simpleRemoteControl1 = new SimpleRemoteControl1();
		
		Light light = new Light();
		LightOnCommand linghtOn = new LightOnCommand(light);
		simpleRemoteControl1.setCommand(linghtOn);
		simpleRemoteControl1.butternWasPressed();
		
		GarageDoor door = new GarageDoor();
		GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(door);
		simpleRemoteControl1.setCommand(doorOpen);
		simpleRemoteControl1.butternWasPressed();
		
		GarageDoorCloseCommand doorClose = new GarageDoorCloseCommand(door);
		simpleRemoteControl1.setCommand(doorClose);
		simpleRemoteControl1.butternWasPressed();
	}

}
