package Interface;

import java.util.Scanner;

public class Car2 implements Cars {
	int currentSpeed;

	@Override
	public void accelarator(int increamentspeed) {
		int accspeed=currentSpeed+increamentspeed;
		System.out.println("If you apply the accelarator the current speed will turn into: "+accspeed);
		
	}

	@Override
	public void Break(int decreamentspeed) {
		int decspeed=currentSpeed-decreamentspeed;
		System.out.println("If yo apply break the current speed will change to: "+decspeed);
		
	}

	@Override
	public void horn() {
		System.out.println("/////Get out of my way!!! Get out of my way/////");
		
	}

}
