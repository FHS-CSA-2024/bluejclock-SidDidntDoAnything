

public class ClockDriver {
    public static void main(String[] args) {
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        ClockDisplay test1 = new ClockDisplay();
        String test1Output = test1.getTime();
        System.out.println("Empty Con. Test - " + test1Output);
        
        //      * Constructor w/ time given & read time
        ClockDisplay test2 = new ClockDisplay(3, 45);
        String test2Output = test2.getTime();
        System.out.println("2 Arg. Con. Test - " + test2Output);
        
        //      * Set time
        test2.setTime(4, 15);
        System.out.println("Set Time Test - " + test2.getTime());

        //      * Tick time
        test2.timeTick();
        System.out.println("Tick Time Test - " + test2.getTime());

        //  * Tick test for 03:32 to 03:33
        ClockDisplay ticktest1 = new ClockDisplay(3, 32);
        System.out.println("Tick Test 1 PreTick - " + ticktest1.getTime());
        ticktest1.timeTick();
        System.out.println("Tick Test 1 PostTick - " + ticktest1.getTime());

        //  * Tick test for 03:09 to 03:10
        ClockDisplay ticktest2 = new ClockDisplay(3, 9);
        System.out.println("Tick Test 2 PreTick - " + ticktest2.getTime());
        ticktest2.timeTick();
        System.out.println("Tick Test 2 PostTick - " + ticktest2.getTime());

        //  * Tick test for 01:59 to 02:00
        ClockDisplay ticktest3 = new ClockDisplay(1, 59);
        System.out.println("Tick Test 3 PreTick - " + ticktest3.getTime());
        ticktest3.timeTick();
        System.out.println("Tick Test 3 PostTick - " + ticktest3.getTime());

        //  * Tick test for 09:59 to 10:00
        ClockDisplay ticktest4 = new ClockDisplay(9, 59);
        System.out.println("Tick Test 4 PreTick - " + ticktest4.getTime());
        ticktest4.timeTick();
        System.out.println("Tick Test 4 PostTick - " + ticktest4.getTime());

        //  * Tick test for 23:59 to 00:00
        ClockDisplay ticktest5 = new ClockDisplay(23, 59);
        System.out.println("Tick Test 5 PreTick - " + ticktest5.getTime());
        ticktest5.timeTick();
        System.out.println("Tick Test 5 PostTick - " + ticktest5.getTime());
        
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        ClockDisplaySeconds testSec1 = new ClockDisplaySeconds();
        System.out.println("Empty Con. Test (Seconds) - " + testSec1.getTime());

        //      * Constructor w/ time given & read time
        ClockDisplaySeconds testSec2 = new ClockDisplaySeconds(3, 45, 30);
        System.out.println("2 Arg. Con. Test (Seconds) - " + testSec2.getTime());

        //      * Set time
        testSec2.setTime(4, 15, 45);
        System.out.println("Set Time Test (Seconds) - " + testSec2.getTime());

        //      * Tick time
        testSec2.timeTick();
        System.out.println("Tick Time Test (Seconds) - " + testSec2.getTime());

        //  * Tick test for 03:32:59 to 03:33:00
        ClockDisplaySeconds tickSecTest1 = new ClockDisplaySeconds(3, 32, 59);
        System.out.println("Tick Test 1 PreTick (Seconds) - " + tickSecTest1.getTime());
        tickSecTest1.timeTick();
        System.out.println("Tick Test 1 PostTick (Seconds) - " + tickSecTest1.getTime());

        //  * Tick test for 01:00:59 to 01:01:00
        ClockDisplaySeconds tickSecTest2 = new ClockDisplaySeconds(1, 0, 59);
        System.out.println("Tick Test 2 PreTick (Seconds) - " + tickSecTest2.getTime());
        tickSecTest2.timeTick();
        System.out.println("Tick Test 2 PostTick (Seconds) - " + tickSecTest2.getTime());

        //  * Tick test for 01:59:59 to 02:00:00
        ClockDisplaySeconds tickSecTest3 = new ClockDisplaySeconds(1, 59, 59);
        System.out.println("Tick Test 3 PreTick (Seconds) - " + tickSecTest3.getTime());
        tickSecTest3.timeTick();
        System.out.println("Tick Test 3 PostTick (Seconds) - " + tickSecTest3.getTime());

        //  * Tick test for 23:59:59 to 00:00:00
        ClockDisplaySeconds tickSecTest4 = new ClockDisplaySeconds(23, 59, 59);
        System.out.println("Tick Test 4 PreTick (Seconds) - " + tickSecTest4.getTime());
        tickSecTest4.timeTick();
        System.out.println("Tick Test 4 PostTick (Seconds) - " + tickSecTest4.getTime());


        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        ClockDisplay12Hour test12Hr1 = new ClockDisplay12Hour();
        System.out.println("Empty Con. Test (12 Hour) - " + test12Hr1.getTime());

        //      * Constructor w/ time given & read time
        ClockDisplay12Hour test12Hr2 = new ClockDisplay12Hour(3, 45, "AM");
        System.out.println("2 Arg. Con. Test (12 Hour) - " + test12Hr2.getTime());

        //      * Set time
        test12Hr2.setTime(4, 15);
        System.out.println("Set Time Test (12 Hour) - " + test12Hr2.getTime());

        //      * Tick time
        test12Hr2.timeTick();
        System.out.println("Tick Time Test (12 Hour) - " + test12Hr2.getTime());

        //  * Tick test for 03:32PM to 03:33PM
        ClockDisplay12Hour tick12HrTest1 = new ClockDisplay12Hour(3, 32,"PM");
        System.out.println("Tick Test 1 PreTick (12 Hour) - " + tick12HrTest1.getTime());
        tick12HrTest1.timeTick();
        System.out.println("Tick Test 1 PostTick (12 Hour) - " + tick12HrTest1.getTime());

        //  * Tick test for 11:59PM to 12:00AM
        ClockDisplay12Hour tick12HrTest2 = new ClockDisplay12Hour(11, 59, "PM");
        System.out.println("Tick Test 2 PreTick (12 Hour) - " + tick12HrTest2.getTime());
        tick12HrTest2.timeTick();
        System.out.println("Tick Test 2 PostTick (12 Hour) - " + tick12HrTest2.getTime());

        //  * Tick test for 11:59AM to 12:00PM
        ClockDisplay12Hour tick12HrTest3 = new ClockDisplay12Hour(11, 59, "AM");
        System.out.println("Tick Test 3 PreTick (12 Hour) - " + tick12HrTest3.getTime());
        tick12HrTest3.timeTick();
        System.out.println("Tick Test 3 PostTick (12 Hour) - " + tick12HrTest3.getTime());

        //  * Tick test for 12:59PM to 01:00PM
        ClockDisplay12Hour tick12HrTest4 = new ClockDisplay12Hour(12, 59, "PM");
        System.out.println("Tick Test 4 PreTick (12 Hour) - " + tick12HrTest4.getTime());
        tick12HrTest4.timeTick();
        System.out.println("Tick Test 4 PostTick (12 Hour) - " + tick12HrTest4.getTime());
    }
}

