package day4;

abstract class Vehicle{
	int price = 1000;
	public abstract void start();
	public void stop() {
		System.out.println("Vehicle Stopped");
	}
}

interface MusicPlayer{
	void play();
	int noOfSongs = 100;
}

interface Radio{
	void scan();
	int frequency=93;
}

class Car extends Vehicle implements MusicPlayer,Radio{
	String acType;
	int price = 3000;
	
	public void start() {
		System.out.println("Vehicle Started");
	}
	
	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("Music Scanned");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Music Played");
	}
	
}
public class Interfaces {
	Car c = new Car();
	
	
}
