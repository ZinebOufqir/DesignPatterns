package com.observer;



public class Suscriber {
	
	private String nameString;
	public Suscriber(String nameString) {
		super();
		this.nameString = nameString;
	}

	private Channel channel = new Channel();
	
	public void update() {
		System.out.println("Hey " +nameString +" Video Uploaded :" +channel.getTitle());
	}
	
	public void suscribeChannel(Channel ch) {
		channel = ch;
	}
}
