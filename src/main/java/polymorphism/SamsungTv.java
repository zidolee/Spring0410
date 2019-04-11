package polymorphism;

public class SamsungTv  implements TV {
	@Override
	public void powerOn() {
		System.out.println("SamsungTv---전원 켜다");
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTv---전원 끄다");
	}
	@Override
	public void volumeUp() {
		System.out.println("SamsungTv---소리 올린다.");
	}
	@Override
	public void volumeDown() {
		System.out.println("SamsungTv---소리 내린다.");
	}
}
