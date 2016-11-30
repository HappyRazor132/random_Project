/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author zjliu
 */
public class HelloWorld {
    public static void main(String[] args) {
        try {
            double a;
            trivialEstimations trivia = new trivialEstimations();    
            Calculator cal = new Calculator();
            a = trivia.geometricSeries(1,.5,100000000);
            System.out.println("Hello World!" + " " +a);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        }
    }
    class Calculator{
    public double decimalAdd(double input1,double input2){
        // adds two numbers
    return input1+input2;
    }
    public double decimalMultiply(double input1, double input2){
        // multiplies two numbers
    return input1*input2;
    }
    public double decimalSubtract(double input1, double input2){
        // subtracts two numbers
    return input1-input2;
    }
    public double decimalDivide(double input1, double input2){
        // divides two numbers
    return input1/input2;
    }
    public double decimalNegate(double input1){
        // negates a number; gives the additive inverse
    return decimalSubtract(0,input1);
    }
    public double decimalSquareRoot(double input1){
        // square roots a number
    return Math.sqrt(input1);
    }
    public double decimalExponentation(double input1, double input2){
        // gets input1^input2
    return Math.pow(input1, input2);
    }
    public double decimalNthRoot(double input1, double input2){
        // gets the input2th root of input1
    return Math.pow(input1, decimalDivide(1,input2));
    }
    }
    class trivialEstimations{
        Calculator cal = new Calculator();
        public double pSeries(double n){
            double sum = 0;
            // Please don't use for values close to 1, approximates the value of 
            // 1/1^n+1/2^n+1/3^n+... Doesn't acually evaluate actual value
            if (n<=1){
                throw null;
            }
            else{
            for(int k = 1; k<=2000000; k++){
                double term = cal.decimalDivide(1, cal.decimalExponentation(k, n));
                sum = sum + term;
            }
            }
            return sum;
        }
        public double geometricSeries(double startValue, double ratio, int size){
            // evaluates a geometric sequence, given the initial value, ratio, and number of terms in the sequence
            int currentTermNumber = 1;
            double sum = 0;
        while (currentTermNumber <= size){
            sum = sum + startValue;
            startValue = cal.decimalMultiply(ratio, startValue);
            currentTermNumber++;
        }
        return sum;
    }
        //There will be a humorous note at the bottom
    }
        
