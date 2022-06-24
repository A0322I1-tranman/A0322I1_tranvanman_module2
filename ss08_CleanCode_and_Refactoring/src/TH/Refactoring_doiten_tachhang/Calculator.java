package TH.Refactoring_doiten_tachhang;

public class Calculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperand, int secondOperand, char operator) {
      switch (operator){
          case  '+':
              return firstOperand + secondOperand;
          case  '-':
              return firstOperand - secondOperand;
          case  '*':
              return firstOperand * secondOperand;
          case  '/':
              if (secondOperand != 0){
                  return firstOperand / secondOperand;
              }else {
                  throw new RuntimeException("Can not divide by 0");
              }
          default:
              throw new RuntimeException("Unsupported operation");
      }
    }

    public static void main(String[] args) {
        System.out.println(calculate(4,5,'+'));
        System.out.println(calculate(4,5,'-'));
        System.out.println(calculate(4,5,'*'));
        System.out.println(calculate(4,5,'/'));
    }
}
