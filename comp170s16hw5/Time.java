public class Time
{
	private int hours;
	private int minutes;
	private boolean isAM;
	
 	public Time()
	{
		hours = 0;
		minutes = 0;
	}
	
	public Time(int newHours, int newMinutes)
	{
		if(this.isValid(newHours, newMinutes))
		{
			hours = newHours;
			minutes = newMinutes;
		}
	}
	
	public Time(int newHours, int newMinutes, boolean isAM)
	{
		if(isAM == true)
		{
			if(this.isValid(newHours, newMinutes))
			{
				hours = newHours;
				minutes = newMinutes;
			}
		}
		else
		{
			if(this.isValid(newHours, newMinutes))
			{
				hours = newHours + 12;
				minutes = newMinutes;
			}
		}
	}
	
	private boolean isValid(int newHours, int newMinutes)
	{
		if(hours >= 0 && minutes >= 0 && hours <= 23 && minutes <= 59)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void setTime(int newHours, int newMinutes)
	{
		if(this.isValid(newHours, newMinutes))
		{
			hours = newHours;
			minutes = newMinutes;
		}
	}
	
	public void setTime(int newHours, int newMinutes, boolean isAM)
	{
		if(isAM == true)
		{
			if(this.isValid(newHours, newMinutes))
			{
				hours = newHours;
				minutes = newMinutes;
			}
		}
		else
		{
			if(this.isValid(newHours, newMinutes))
			{
				hours = newHours + 12;
				minutes = newMinutes;
			}
		}
	}
	
	public String getTime24()
	{
		if(hours < 10)
		{
			if(minutes < 10)
			{
				return "0" + hours + "0" + minutes;
			}
			else
			{
				return "0" + hours + minutes;
			}
		}
		else
		{
			if(minutes < 10)
			{
				return hours + "0" + minutes;
			}
			else
			{
				return "" + hours + minutes;
			}
		}
	}
	
	public String getTime12()
	{
		if(hours > 0 && hours < 12)
		{
			if(minutes < 10)
			{
				return hours + ":" + "0" + minutes + " AM";
			}
			else
			{
				return hours + ":" + minutes + " AM";
			}
		}
		else if(hours > 12)
		{
			if(minutes < 10)
			{
				return (hours-12) + ":" + "0" + minutes + " PM";
			}
			else
			{
				return (hours-12) + ":" + minutes + " PM";
			}
		}
		else if(hours == 0)
		{
			if(minutes < 10)
			{
				return "12:" + "0" + minutes + " AM";
			}
			else
			{
				return "12:" + minutes + " AM";
			}
		}
		else
		{
			if(minutes < 10)
			{
				return "12:" + "0" + minutes + " PM";
			}
			else
			{
				return "12:" + minutes + " PM";
			}
		}
	}
	
}