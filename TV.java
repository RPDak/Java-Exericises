
public class TV {
	
	public int channel;
	public int volume;
	public boolean power;
	
	public TV(){
		power = false;
		volume = 1;
		channel = 1;
		
		
	}
	
	public void turnOn(){
		
		power = true;
		
	}
	public void turnOff(){
		
		power = false;
		
	}
	public void setChannel(int c){
		
		if (power == true){
		channel = c;
		}
		
	}
	public void setVolume(int v){
		
		if (power == true){
		volume = v;
		}
		
	}
	public void channelUp(){
		if (power == true){
		channel++;
		}
		
	}
	public void channelDown(){
		if (power == true){
		channel--;
		}
		
	}
	public void volumeUp(){
		if (power == true){
		volume++;
		}
		
	}
	public void volumeDown(){
		if (power == true){
		volume--;
		}
		
	}
	

}
