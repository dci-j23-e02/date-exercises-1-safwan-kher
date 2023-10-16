# Date Exercises_1:

# Exercise 1: Birthday Reminder
John is a forgetful person and he always forgets his friends' birthdays. He wants to create a program that will remind him of his friends' birthdays. He has three friends: Suze, Karl, and Kaiser. Their birthdates are as follows:

- Suze: 21st November 2000
- Karl: 7th September 1993
- Kaiser: 7th September 1855

Write a Java program using the Date and Calendar classes to store these dates and print them out.

# Exercise 2: Age Calculator
John wants to know how old his friends are. Write a Java program that calculates the age of Suze, Karl, and Kaiser based on their birthdates and the current date. Use the LocalDate class to achieve this.

- **Step 1: Import the necessary classes**
At the top of your Java file, import the necessary classes. You will need the `java.time.LocalDate` and `java.time.Period` classes.

```java
import java.time.LocalDate;
import java.time.Period;
```

- **Step 2: Define the birthdates**
Define the birthdates of Suze, Karl, and Kaiser using the `LocalDate.of(year, month, day)` method.

```java
LocalDate suzeBirthdate = LocalDate.of(2000, 11, 21);
LocalDate karlBirthdate = LocalDate.of(1993, 9, 7);
LocalDate kaiserBirthdate = LocalDate.of(1855, 9, 7);
```

- **Step 3: Get the current date**
Get the current date using the `LocalDate.now()` method.

```java
LocalDate currentDate = LocalDate.now();
```

-  **Step 4: Calculate the ages**
Calculate the ages of Suze, Karl, and Kaiser by subtracting their birthdates from the current date. Use the `Period.between(startDate, endDate)` method to do this.

```java
int suzeAge = Period.between(suzeBirthdate, currentDate).getYears();
int karlAge = Period.between(karlBirthdate, currentDate).getYears();
int kaiserAge = Period.between(kaiserBirthdate, currentDate).getYears();
```

- **Step 5: Print the ages**
Print the ages of Suze, Karl, and Kaiser.

```java
System.out.println("Suze is " + suzeAge + " years old.");
System.out.println("Karl is " + karlAge + " years old.");
System.out.println("Kaiser is " + kaiserAge + " years old.");
```

That's it! You have successfully written a Java program that calculates the age of John's friends.

# Exercise 3: Leap Year Checker
John heard that people born in a leap year are lucky. He wants to check if any of his friends were born in a leap year. Write a Java program that checks if the years 2000, 1993, and 1855 are leap years or not.
- **Step 1: Import the necessary classes**
At the top of your Java file, import the necessary classes. You will need the `java.time.Year` class.

```java
import java.time.Year;
```

- **Step 2: Define the years**
Define the years of birth for Suze, Karl, and Kaiser.

```java
int suzeBirthYear = 2000;
int karlBirthYear = 1993;
int kaiserBirthYear = 1855;
```

- **Step 3: Check if the years are leap years**
Use the `isLeap()` method of the `Year` class to check if the years are leap years. This method returns `true` if the year is a leap year and `false` otherwise.

```java
boolean isSuzeBirthYearLeap = Year.isLeap(suzeBirthYear);
boolean isKarlBirthYearLeap = Year.isLeap(karlBirthYear);
boolean isKaiserBirthYearLeap = Year.isLeap(kaiserBirthYear);
```

- **Step 4: Print the results**
Print the results. If the `isLeap()` method returned `true` for a year, print that the year is a leap year. Otherwise, print that it is not a leap year.

```java
System.out.println(suzeBirthYear + " is a leap year: " + isSuzeBirthYearLeap);
System.out.println(karlBirthYear + " is a leap year: " + isKarlBirthYearLeap);
System.out.println(kaiserBirthYear + " is a leap year: " + isKaiserBirthYearLeap);
```

That's it! You have successfully written a Java program that checks if the years 2000, 1993, and 1855 are leap years or not.

# Exercise 4: Birthday Countdown
John wants to know how many days are left until his friends' next birthdays. Write a Java program that calculates the number of days until the next birthday for Suze, Karl, and Kaiser.

1. **Import the necessary classes**
    At the top of your Java file, import the necessary classes. You will need the `java.time.LocalDate` and `java.time.Period` classes.
    ```java
    import java.time.LocalDate;
    import java.time.Period;
    ```

2. **Define the birthdates**
    Define the birthdates of Suze, Karl, and Kaiser using the `LocalDate.of(year, month, day)` method.
    ```java
    LocalDate suzeBirthdate = LocalDate.of(2000, 11, 21);
    LocalDate karlBirthdate = LocalDate.of(1993, 9, 7);
    LocalDate kaiserBirthdate = LocalDate.of(1855, 9, 7);
    ```

3. **Get the current date**
    Get the current date using the `LocalDate.now()` method.
    ```java
    LocalDate currentDate = LocalDate.now();
    ```

4. **Calculate the next birthdays**
    Calculate the next birthdays of Suze, Karl, and Kaiser. If the birthday this year has already passed, add one year to the birthdate.
    ```java
    LocalDate nextSuzeBirthday = suzeBirthdate.withYear(currentDate.getYear());
    if (nextSuzeBirthday.isBefore(currentDate) || nextSuzeBirthday.isEqual(currentDate)) {
        nextSuzeBirthday = nextSuzeBirthday.plusYears(1);
    }

    LocalDate nextKarlBirthday = karlBirthdate.withYear(currentDate.getYear());
    if (nextKarlBirthday.isBefore(currentDate) || nextKarlBirthday.isEqual(currentDate)) {
        nextKarlBirthday = nextKarlBirthday.plusYears(1);
    }

    LocalDate nextKaiserBirthday = kaiserBirthdate.withYear(currentDate.getYear());
    if (nextKaiserBirthday.isBefore(currentDate) || nextKaiserBirthday.isEqual(currentDate)) {
        nextKaiserBirthday = nextKaiserBirthday.plusYears(1);
    }
    ```

5. **Calculate the number of days until the next birthdays**
    Calculate the number of days until the next birthdays of Suze, Karl, and Kaiser using the `Period.between(startDate, endDate)` method.
    ```java
    long daysUntilSuzeBirthday = Period.between(currentDate, nextSuzeBirthday).getDays();
    long daysUntilKarlBirthday = Period.between(currentDate, nextKarlBirthday).getDays();
    long daysUntilKaiserBirthday = Period.between(currentDate, nextKaiserBirthday).getDays();
    ```

6. **Print the number of days until the next birthdays**
    Print the number of days until the next birthdays of Suze, Karl, and Kaiser.
    ```java
    System.out.println("Days until Suze's next birthday: " + daysUntilSuzeBirthday);
    System.out.println("Days until Karl's next birthday: " + daysUntilKarlBirthday);
    System.out.println("Days until Kaiser's next birthday: " + daysUntilKaiserBirthday);
    ```

That's it! You have successfully written a Java program that calculates the number of days until the next birthday for Suze, Karl, and Kaiser.

# Exercise 5: Zodiac Sign Finder
John is interested in astrology and wants to know the zodiac signs of his friends. Write a Java program that determines the zodiac sign of a person based on their birthdate. The zodiac signs are determined as follows:

- Aries: March 21 - April 19
- Taurus: April 20 - May 20
- Gemini: May 21 - June 20
- Cancer: June 21 - July 22
- Leo: July 23 - August 22
- Virgo: August 23 - September 22
- Libra: September 23 - October 22
- Scorpio: October 23 - November 21
- Sagittarius: November 22 - December 21
- Capricorn: December 22 - January 19
- Aquarius: January 20 - February 18
- Pisces: February 19 - March 20


1. **Import the necessary classes**
    At the top of your Java file, import the necessary classes. You will need the `java.time.LocalDate` class.
    ```java
    import java.time.LocalDate;
    ```

2. **Define the birthdates**
    Define the birthdates of Suze, Karl, and Kaiser using the `LocalDate.of(year, month, day)` method.
    ```java
    LocalDate suzeBirthdate = LocalDate.of(2000, 11, 21);
    LocalDate karlBirthdate = LocalDate.of(1993, 9, 7);
    LocalDate kaiserBirthdate = LocalDate.of(1855, 9, 7);
    ```

3. **Create a method to determine the zodiac sign**
    Create a method that takes a `LocalDate` as a parameter and returns a `String` representing the zodiac sign. Use the `getMonthValue()` and `getDayOfMonth()` methods of the `LocalDate` class to determine the zodiac sign.
    ```java
    public static String getZodiacSign(LocalDate birthdate) {
        int month = birthdate.getMonthValue();
        int day = birthdate.getDayOfMonth();

        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "Gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "Sagittarius";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            return "Capricorn";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "Aquarius";
        } else {
            return "Pisces";
        }
    }
    ```

4. **Determine the zodiac signs**
    Use the `getZodiacSign()` method to determine the zodiac signs of Suze, Karl, and Kaiser.
    ```java
    String suzeZodiacSign = getZodiacSign(suzeBirthdate);
    String karlZodiacSign = getZodiacSign(karlBirthdate);
    String kaiserZodiacSign = getZodiacSign(kaiserBirthdate);
    ```

5. **Print the zodiac signs**
    Print the zodiac signs of Suze, Karl, and Kaiser.
    ```java
    System.out.println("Suze's zodiac sign is " + suzeZodiacSign);
    System.out.println("Karl's zodiac sign is " + karlZodiacSign);
    System.out.println("Kaiser's zodiac sign is " + kaiserZodiacSign);
    ```

That's it! You have successfully written a Java program that determines the zodiac sign of a person based on their birthdate.
