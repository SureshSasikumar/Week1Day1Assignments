package week1.day1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors =2;
	long chassisNumber = 8965687L;
	boolean isPunctured = false;
	String bikeName ="yamaha";
	double runningKM = 5600045.6983;
	
public static void main(String[] args) {
	TwoWheeler tw= new TwoWheeler();
	
	System.out.println("noOfWheels"+ tw.noOfWheels);
	System.out.println("noOfMirrors"+ tw.noOfMirrors);
	System.out.println("chassisNumber"+ tw.chassisNumber);
	System.out.println("isPunctured"+tw.isPunctured);
	System.out.println("bikeName"+tw.bikeName);
	System.out.println("runningKM"+tw.runningKM);
}
}
