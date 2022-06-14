import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Clock {
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_RED = "\u001B[31m";

  public static void main(String[] args) {

    

    LocalDateTime myTime = LocalDateTime.now();
    DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("HH:mm");


    String formattedTime = myTime.format(myFormat);

    System.out.println("The current time is: " + ANSI_RED + formattedTime + ANSI_RESET);

  }


}