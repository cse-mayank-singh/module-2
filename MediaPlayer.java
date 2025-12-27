class MediaPlayer {
    private String brand;
    private int volume;
    public MediaPlayer(String brand,int volume) {
        this.brand = brand;
        this.volume = volume;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void displayMediaPlayer(){
    	System.out.println("\nMedia Player Details\n===============\nbrand is "+getBrand()+" and volume is "+getVolume());
    }
}
