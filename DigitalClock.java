   import java.time.format.DateTimeFormatter;
   import java.time.LocalTime;
   class DigitalClock{
   public static void main(String[]args){
   DataTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:MM:SS");
   while(true){
   LocalTime currentTime=LocalTime.now();
   String formattedTime=currentTime.format(formatter);
  System.out.print("\r current time is: "+ formattedTime);
  try{
        Thread.sleep(1000);
   }
  catch(InterruptedException e)
    { 
      System.out.println(e);
    }
       } 
          }
            }