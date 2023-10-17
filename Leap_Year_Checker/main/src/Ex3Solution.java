import java.time.Year;

public class Ex3Solution {
public static void main(String[] args){
  // Step1: store the year of birth for each freind in an integer variable
  int suzeBirthYear = 2000;
  int karlBirthYear = 1993;
  int kaiserBirthYear = 1855;

  // Step2: using the Year.isLeap() static method:
  boolean isSuzeBirthYearLeap = Year.isLeap(suzeBirthYear);
  boolean isKarlBirthYearLeap = Year.isLeap(karlBirthYear);
  boolean isKaiserBirthYearLeap = Year.isLeap(kaiserBirthYear);

  // Step3: print the results
  System.out.println(suzeBirthYear + " is a leap year: "+ isSuzeBirthYearLeap );
  System.out.println(karlBirthYear + " is a leap year: "+ isKarlBirthYearLeap );
  System.out.println(kaiserBirthYear + " is a leap year: "+ isKaiserBirthYearLeap );


}
}
