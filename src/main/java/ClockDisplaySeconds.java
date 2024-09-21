

public class ClockDisplaySeconds
{
   
   
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String display;

    
    public ClockDisplaySeconds(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        updateDisplay();
    }
    
    //same as the other
    public ClockDisplaySeconds(int hour, int minute, int second){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        setTime(hour, minute, second);
    }
    
    //just calls number display super simple
    public void timeTick(){
        seconds.increment();
        if (seconds.getValue() == 0){
            minutes.increment();
        }
        if (minutes.getValue() == 0){
            hours.increment();
        }
        updateDisplay();
    }
    
    //literally just the same
    public void setTime(int hour, int minute, int second){
        hours.setValue(hour);
        minutes.setValue(minute);
        seconds.setValue(second);
        updateDisplay();
    }
    
   //just returns
    public String getTime(){
        return display;
    }

    // now its hh:mm:ss
    public void updateDisplay(){
        display = hours.getDisplayValue() + ":" + minutes.getDisplayValue() + ":" + seconds.getDisplayValue();
    }
}

