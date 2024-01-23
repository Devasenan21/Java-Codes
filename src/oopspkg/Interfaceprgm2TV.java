package oopspkg;

interface TVremote
{
	public void volumeup();
	void volumedown();
	void channelup();
	void channeldown();
}

interface smartTVremote extends TVremote
{
	void bluetooth();
	void wifi();
	void youtube();
	
}

class TV implements smartTVremote
{

	@Override
	public void volumeup() {
		System.out.println("volumeup is working");
		
	}

	@Override
	public void volumedown() {
		System.out.println("volume down is working");
		
	}

	@Override
	public void channelup() {
		System.out.println("channelup is working");
		
	}

	@Override
	public void channeldown() {
		System.out.println("channel down is working");
		
	}

	@Override
	public void bluetooth() {
		System.out.println("bluetooyh connectivity is working");
		
	}

	@Override
	public void wifi() {
		System.out.println("wifi connectivity is working");
		
	}

	@Override
	public void youtube() {
		System.out.println("youtube is working");
		
	}

}
	
public class Interfaceprgm2TV {

	public static void main(String[] args) {
		
		TV ob=new TV();
		ob.channelup();
		ob.channeldown();
		ob.volumeup();
		ob.volumedown();
		ob.wifi();
		ob.bluetooth();
		ob.youtube();
		

	}

}
