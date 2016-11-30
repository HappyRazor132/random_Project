import java.lang.*;

public class helloWorld
{
  public static void main(String[] args)
  {
  	double a;
    Calculator cal = new Calculator();
  	a = cal.decimalMultiply(1.7,2.3);
    System.out.println("Hello World!" + " " +a); 
  }
}

class Calculator
{
  public double decimalAdd(double input1,double input2){
    return input1+input2;
  }
  public double decimalMultiply(double input1, double input2){
    return input1*input2;
  }
  public double decimalSubtract(double input1, double input2){
    return input1-input2;
  }
  public double decimalDivide(double input1, double input2){
    return input1/input2;
  }
  public double decimalNegate(double input1){
    return decimalSubtract(0,input1);
  }
}
