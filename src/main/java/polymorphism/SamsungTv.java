package polymorphism;

public class SamsungTv  implements TV {
	
	private SonySpeaker speaker;
	
	public SamsungTv() {
		System.out.println("===> SamsungTv(1) 생성자(기본) --- 객체 생성");
	}
	
	//생성자 오버로딩 -> 생성자 인젝션
	public SamsungTv(SonySpeaker speaker) {
		System.out.println("===> SmasungTv(2) 생성자(오버로딩) --- 객체 생성");
		this.speaker = speaker;
	}
	
	//init-method 속성
	public void initMethod() {
		System.out.println("initMethod --- 객체 초기화 작업 처리");
	}
	
	// destroy-method 속성
	public void destroyMethod() {
		System.out.println("destroyMehod --- 객체 삭제 전에 처리할 로직 처리");
	}
	
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
//		System.out.println("SamsungTv---소리 올린다.");
//		speaker = new SonySpeaker();
		speaker.volumeUp();
	}
	
	@Override
	public void volumeDown() {
//		System.out.println("SamsungTv---소리 내린다.");
//		speaker = new SonySpeaker();
		speaker.volumeDown();
	}
}
