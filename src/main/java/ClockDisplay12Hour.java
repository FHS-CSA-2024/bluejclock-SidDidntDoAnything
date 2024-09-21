


public class ClockDisplay12Hour
{
    //Extend ClockDisplay for a 12 hour clock. This means you need to track AM/PM
    //Update all methods and parameters to accomodate this change
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String meridian;
    private String display;

    
    public ClockDisplay12Hour(){
        hours = new NumberDisplay(12);
        minutes = new NumberDisplay(60);
        meridian = "AM";
        updateDisplay();
    }
    
    //same as the other
    public ClockDisplay12Hour(int hour, int minute, String merid){
        hours = new NumberDisplay(12);
        minutes = new NumberDisplay(60);
        meridian = merid; 
       
        setTime(hour, minute);
    }
    
    //just calls number display super simple
    public void timeTick(){
        minutes.increment();
        if (minutes.getValue() == 0){
            hours.increment();
        }
        updateDisplay();
    }
    
    //literally just the same
    public void setTime(int hour, int minute){
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }
    
   //just returns
    public String getTime(){
        return display;
    }

    // now its hh:mm:ss
    public void updateDisplay(){
        int hour = hours.getValue();
        
        
        
        if (hour == 0 && meridian == "AM"){
            meridian = "PM";
        }
        else {
            meridian = "AM";
        }
        
        display = hours.getDisplayValue() + ":" + minutes.getDisplayValue() + " " + meridian;
    }
}

