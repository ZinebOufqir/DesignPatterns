package com.observer;

public class Youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Channel friends = new Channel();
		
		Suscriber s1 = new Suscriber("Joey");
		Suscriber s2 = new Suscriber("Ross");
		Suscriber s3 = new Suscriber("Luna");
		Suscriber s4 = new Suscriber("Phoebe");
		
		friends.suscribe(s1);
		friends.suscribe(s2);
		friends.suscribe(s3);
		friends.suscribe(s4);
		
		
		
		s1.suscribeChannel(friends);
		s2.suscribeChannel(friends);
		s3.suscribeChannel(friends);
		s4.suscribeChannel(friends);
		
		friends.upload("Ross proposing to rachel");
		System.out.println("------Phoebe has unsuscribe to the channel--------");
		friends.unsuscribe(s4);
		
		friends.upload("We were on break");
	}

}
