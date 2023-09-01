package week1.day1;

public class Mobile {
	public String makeCall(String mobileModel,float mobileWeight) {
		return mobileModel + " "+ mobileWeight ;
	}
	public int sendMsg(boolean isFullCharged,int mobileCost) {
		return  mobileCost;
	}
	public static void main(String[] args) {
		Mobile mo=new Mobile();
		System.out.println("This is my mobile");
		System.out.println(mo.makeCall("samsung",10.0f));
		System.out.println(mo.sendMsg(false, 1000));
	}
}
