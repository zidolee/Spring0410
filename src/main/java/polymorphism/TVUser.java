package polymorphism;

public class TVUser {
	public static void main(String[] args) {
//		SamsungTv tv = new SamsungTv();
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		
		// 2. LG tv
//		LgTv tv = new LgTv();
//		tv.turnOn();
//		tv.soundUp();
//		tv.SoundDown();
//		tv.turnOff();
		
		//다형성 구현 ----> 결합도를 낮추기 위한 방법
		
		TV tv = new LgTv();
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
}
