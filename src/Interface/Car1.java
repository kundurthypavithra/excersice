package Interface;

import java.util.Scanner;

public class Car1 implements Cars {
	
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
		System.out.println("/////The horn sounds pew pew move away/////");
		
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	

	

}
