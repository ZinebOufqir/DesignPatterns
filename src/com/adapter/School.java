package com.adapter;

public class School {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PilotPen penPilote = new PilotPen();
		PenAdapter adptr = new PenAdapter();
        AssignmentWork asg = new AssignmentWork();
        asg.setP(adptr);
        asg.writeAssignment("I'm bit tired to write an Assignment");
	}
}
