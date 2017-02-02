
public class TimePractice {

	private int hours;
	private int minutes;
	private int seconds;

	public void setTime(int hours, int minutes, int seconds) {
		this.hours = ((hours >= 0 && hours < 24) ? hours : 0);
		this.minutes = ((minutes >= 0 && minutes < 60) ? minutes : 0);
		this.seconds = ((seconds >= 0 && seconds < 60) ? seconds : 0);

	}

	public String militaryTime() {
		return String.format("%02d: %02d: %02d", hours, minutes, seconds);
	}
	public String americanTime(){
		return String.format("%02d:%02d:%02d%s", ((hours==0 || hours==12) ? 12 : hours%12), minutes, seconds, (hours<12 ? "AM" : "PM"));
	}
	

}
