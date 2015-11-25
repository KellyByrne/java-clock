class Clock {
	private int second = 0;
	private int minute = 0;
	private int hour = 0; 

	public void setTime(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public String getTime(){
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

	public void tick(){
		second ++;
		if(second >= 59){
			minute ++;
			second = 0;
		}
		if(minute == 60){
			hour ++; 
			minute = 0;
		}
	}
}

class runClock {
  public static void main(String[] args) throws InterruptedException{
  	Clock clock = new Clock();

  	clock.setTime(12, 59, 58);
  
  	System.out.println(clock.getTime());

     while (true) {
      clock.tick();
      Thread.sleep(1000);
      System.out.println(clock.getTime());
    }
  }
}