class Time {
	int hours;
	int minutes;
	int seconds;
	
	public Time() {
		hours = 0;
		minutes = 0;
		seconds = 0;
	}

	public Time(int h, int m, int s) {
		hours = h;
		minutes = m;
		seconds = s;
	}

	Time addTime(Time o) {
		Time temp = new Time();

		temp.hours = hours + o.hours;
		temp.minutes = minutes + o.minutes;
		temp.seconds = seconds + o.seconds;
		
		if (temp.seconds >= 60) {
			temp.seconds -= 60;
			temp.minutes++;
		}
		if (temp.minutes >= 60) {
			temp.minutes -= 60;
			temp.hours++;
		}
		if (temp.hours > 12) {
			temp.hours -= 12;
		}

		return temp;
	}

	void display() {
		System.out.println("Time in HH:MM:SS is " + hours + ":" + minutes + ":" + seconds);
	} 

	public static void main(String[] args) {

		Time t = new Time();
		Time t1 = new Time(12, 55, 5);
		Time t2 = new Time(1, 5, 8);

		t = t1.addTime(t2);
		t.display();

	}
}

 

