package edu.cnm.deepdive;

public class TheTernaryOperator {
//the ternary operator is basically an if else statement: boolean - if true - else false.
  public static void main(String[] args) {
      int x = 10;
      int y;
      if (x > 5) {
        y = 2 * x;
      } else {
        y = 4 * x;
      }
    System.out.println("y = " + y);

      //same with a ternary operator in one line:
     y = x > 5 ? 2 * x : 4 * x;
     //better with brackets.
    y = (x > 5) ? (2 * x) : (4 * x);
    System.out.println("y = " + y);

    //different data type example
    y = 1;
    System.out.println(y > 5 ? 10 : "Test");
    //int myInt = y < 10 ? 5 : "Test"; gives a compilation error because myInt and String are not compatible.

    //Careful: since Java 7 the ternary operator works the same as short circuit &&, || and ^, meaning
    //that the second expression is only evaluated when needed.

    int a = 1;
    int b = 1;
    int c = a < 10 ? a++ : b++;
    //c will be 1 (a before increment), then a will be set to 2 and b will stay 1 because the second
    //part will not be evaluated.
    System.out.println("a = " + a + ", b = " + b + " and c = " + c);

    int d = 1;
    int e = 2;
    int f = 3;
    if (d < 10) {
      f = d++ < 1 ? e++ : f++;//we use this because d is smaller than 10.
      //is d (=1) < 1? No so we use the second part of the expression.
      //d increments to 2, the e++ statement is not executed so e stays 2, f is f before increment
      // so f is given value 3.
    } else {
      f = (d + e) < 2 ? d++ : e++;
    }
    System.out.println("d = " + d + ", e = " + e + " and f = " + f);

  }

}
