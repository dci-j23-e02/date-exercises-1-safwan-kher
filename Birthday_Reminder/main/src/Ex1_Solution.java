import java.util.Calendar;
import java.util.Date;

public class Ex1_Solution {
public static void main(String[] args){
// Step1: creating a calendar instance for each friend's birthdate
  // Suze's birthdate :
  // Step2: using Calendar abstract class getInstance() for creating an instance
  Calendar cal1 = Calendar.getInstance(); // we create an empty instance of Calendar abstract class
  //  Step3: setting the birthdate using set method
  cal1.set(2000, Calendar.NOVEMBER, 21);
  //  Step4: getting a dat instance of the same value ( same birthdate )
  Date suzeBirthdate = cal1.getTime();
  // Step5: printing the birthdate
  System.out.println("Suze's Birthdate is: " + suzeBirthdate);

  // Karl's birthdate :
  // Step2: using Calendar abstract class getInstance() for creating an instance
  Calendar cal2 = Calendar.getInstance(); // we create an empty instance of Calendar abstract class
  //  Step3: setting the birthdate using set method
  cal2.set(1993, Calendar.SEPTEMBER, 7);
  //  Step4: getting a dat instance of the same value ( same birthdate )
  Date karlBirthdate = cal2.getTime();
  // Step5: printing the birthdate
  System.out.println("Karl's Birthdate is: " + karlBirthdate);

  // Kaiser's birthdate :
  // Step2: using Calendar abstract class getInstance() for creating an instance
  Calendar cal3 = Calendar.getInstance(); // we create an empty instance of Calendar abstract class
  //  Step3: setting the birthdate using set method
  cal3.set(1855, Calendar.SEPTEMBER, 7);
  //  Step4: getting a dat instance of the same value ( same birthdate )
  Date kaiserBirthdate = cal3.getTime();
  // Step5: printing the birthdate
  System.out.println("Kaiser's Birthdate is: " + kaiserBirthdate);
}
}
