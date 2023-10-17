
import  java.time.LocalDate;
import java.time.Period;

public class Ex2Solution {
public static void main(String[] args){
  // Step1 creating birthdays instances using LocalDate constructor
  /**
   * Accessing the Private Constructor:
   * If a constructor is declared private, we can’t create an object of the class, except within the class.
   * A private constructor is used when we want to limit the way objects of a class are instantiated.
   * LocalDate with of():
   * */

LocalDate suzeBirthdate = LocalDate.of(2000, 11, 21);
LocalDate karlBirthdate = LocalDate.of(1993,9,7);
LocalDate kaiserBirthdate = LocalDate.of(1855,9,7);

 // Step2 get the current date
LocalDate currentDate = LocalDate.now();  // it will be the best for this exercise

// Step 3 : calculate the age of each friend using Period.between()
  int suzeAge = Period.between(suzeBirthdate, currentDate).getYears();
  int karlAge = Period.between(karlBirthdate, currentDate).getYears();
  int kaiserAge = Period.between(kaiserBirthdate, currentDate).getYears();

// Step4 : print the results
  System.out.println("Suze is " + suzeAge + " years old.");
  System.out.println("Karl is " + karlAge + " years old.");
  System.out.println("Kaiser is " + kaiserAge + " years old.");





}
}
