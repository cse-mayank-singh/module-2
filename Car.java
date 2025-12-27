class Car{
	private String brand;
	private String color;
	private Engine engine=new Engine(1000,"V8");//composition setting from inside after creating object strong dependency
	private MediaPlayer mediaPlayer;
	public Car(String brand,String color,Engine engine){
		this.brand=brand;
		this.color=color;
		this.engine=engine;
	}
	public String getBrand(){
		return brand;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color=color;
	}
	public Engine getEngine(){
		return engine;
	}
	public void displayCarDetails(){
    	System.out.println("\nCar Details\n|========================|\nbrand and volume "+getBrand()+" "+getColor());
    }
	public MediaPlayer getMediaPlayer(){
		return mediaPlayer;
	}
	//setter method dependency injection for aggregation  //Aggregation, setting from outside ; independent 
	public void setMediaPlayer(MediaPlayer mediaPlayer){
		this.mediaPlayer=mediaPlayer;
	}
}
//CAP-JAV-DEC-ONL-0031