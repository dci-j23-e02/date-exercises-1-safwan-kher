import java.time.LocalDate;
import java.time.Period;

public class Ex4Solutions {
public static void main(String[] args){
  // Step1: define the birthdates for the friends
  LocalDate suzeBirthdate = LocalDate.of(2000, 11, 21);
  LocalDate karlBirthdate = LocalDate.of(1993, 9, 7);
  LocalDate kaiserBirthdate = LocalDate.of(1855, 9, 7);

  System.out.println("Days until Suze's next birthday: " + getDaysUntilNextBirthday(suzeBirthdate));
  System.out.println("Days until Karl's next birthday: " + getDaysUntilNextBirthday(karlBirthdate));
  System.out.println("Days until Kaiser's next birthday: " + getDaysUntilNextBirthday(kaiserBirthdate));

}


/**
 * @return : it returns the number of days left until next birthday
 * */
  public static int getDaysUntilNextBirthday(LocalDate birthdate){
  // Step1: get the current date
    LocalDate currentDate = LocalDate.now();

  //Step2: Creating a new 'LocalDate' object that represents the next birthday of the person.
    LocalDate nextBirthDay = birthdate.withYear(currentDate.getYear());
    // if today's year 2023 and the 'birthdate' is '2000.9.21', then nextBirthDay will be '2023.9.21'

    // If the birthday has occurred this year already, add 1 year
    if(nextBirthDay.isBefore(currentDate) || nextBirthDay.isEqual(currentDate) ){
      nextBirthDay = nextBirthDay.plusYears(1);
    }
     // returns the number of days between current day and next birthday
    return Period.between(currentDate, nextBirthDay).getDays();

  }

}
