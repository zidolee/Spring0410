package polymorphism;

import org.springframework.stereotype.Component;

@Component("tv")
public class LgTv implements TV {
	
	public LgTv() {
		System.out.println("===> LgTv 객체 생성");
	}
	
	@Override
	public void powerOn() {
		System.out.println("LgTv---전원켜다");
	}

	@Override
	public void volumeUp() {
		System.out.println("LgTv---소리 올리다");
	}

	@Override
	public void volumeDown() {
		System.out.println("LgTv---소리 내리다");
	}
	
	@Override
	public void powerOff() {
		System.out.println("LgTv---전원끄다");
	}
}
