package activities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {

	
	
		
	
	
			private int maxPassengers;
			private List<String> arrayPassengers;
			private Date lasttimeTakeOff;
			private Date lasttimeLanded;
			
			public Plane(int maxPassengers) 
			{
				this.maxPassengers = maxPassengers;
				this.arrayPassengers = new ArrayList<>();
				
			}
			public void onboard(String passenger)
			{
				this.arrayPassengers.add(passenger);
			}
			
			public Date takeOff()
			{
				this.lasttimeTakeOff = new Date();
				return lasttimeTakeOff;
			}
			
			public void land()
			{
				this.lasttimeLanded = new Date();
				this.arrayPassengers.clear();
			}
			public Date getLastTimeLanded()
			{
				return lasttimeLanded;
			}
			
			public List<String> getPassengers()
			{
				return arrayPassengers;
			}
		}
		
		

	


