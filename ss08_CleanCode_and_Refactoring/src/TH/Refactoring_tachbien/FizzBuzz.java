package TH.Refactoring_tachbien;

public class FizzBuzz {

    public static String fizzBuzz(int number) {
        boolean isFizz = number % 3==0;
        boolean isBuzz = number % 5==0;
        if (isFizz && isBuzz){
            return "FizzBuzz";
        }
        if (isBuzz){
            return "Fizz";
        }
        if (isFizz){
            return "Buzz";
        }
        return number + "";
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(25));
        System.out.println(fizzBuzz(30));
        System.out.println(fizzBuzz(15));
    }
}
