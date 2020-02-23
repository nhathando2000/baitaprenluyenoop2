package donguyennhathan.com.model;

public class Hourly extends Employee {
	private int hoursWorked;
	public void addHours (int hoursWorked)
	{
		this.hoursWorked=hoursWorked;
	}
	public double pay()
	{
		return this.hoursWorked*50;
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
