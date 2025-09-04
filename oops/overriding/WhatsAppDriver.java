package com.oops.overriding;

class WhatsAppV1{
	void sent() {
		System.out.println("Single tick");
	}
	void anotherFeature() {
		System.out.println("Extra Features...");
	}
}

class WhatsAppV2 extends WhatsAppV1{
	@Override
	protected void sent() {
		super.sent();
		System.out.println("Double tick");
	}
	void voiceNote() {
		System.out.println("Voice Msg");
	}
	public void videoCall() {
		System.out.println("Video calling.....");
	}
}

class WhatsAppV3 extends WhatsAppV2 {
	@Override
	protected void sent() {
		super.sent();
		System.out.println("Blue tick");
	}
	@Override
	public void videoCall() {
		System.out.println("HD quality Video calling.....");
	}
}

public class WhatsAppDriver {

	public static void main(String[] args) {

		WhatsAppV3 wv3=new WhatsAppV3();
		wv3.sent();
		wv3.voiceNote();
		wv3.videoCall();
		wv3.anotherFeature();
	}

}
