package Activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;




public class Plane {
	
	private int maxPassengers;
	private List<String> passengers;
	private Date lastTimetookOff;
	private Date lastTimeLanded;
	
	public Plane(int maxPassengers){
		 this.maxPassengers = maxPassengers;
	     this.passengers = new ArrayList();
		}
	
	public void onboard(String passenger) {
        this.passengers.add(passenger);
    }
	
	public Date takeOff() {
        this.lastTimetookOff = new Date();
        return lastTimetookOff;
    }

	public void land() {
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }
	
	public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public List<String> getPassengers() {
        return passengers;
    }
}
