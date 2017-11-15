package components.comp3_objects.project.sp17;

import java.io.*;

class Calculator
{
    
    final String CALC_NAME = "ti98.1.2.69dogo";
    private int varAmount;
    private double answer;
    double[] nums ;
    private char oper;
    
    Calculator()
    {
        
        
    }
    
    public void setVarAmount(int userInput)
    {

        varAmount = userInput;
        nums = new double[varAmount];

    }
    
    public int getVarAmount()
    {
        
        return varAmount;
        
    }
   
    public void setOper(char op)
    {
        
       oper =  op;
        
    }
    
    public char getOper()
    {
        
        return oper;
        
    }
    
    public double addition(double [ ] value)
    {
        double total = 0;
        
          for(int i=0; i<nums.length; i++)
          {
              total = total + value[i];
          }

          return (total);
     }
    
    public double subtraction(double [ ] value)
    {
        double total = 0;
        
          for(int i=0; i<nums.length; i++)
          {
              total = total - value[ i ];
          }

          return (total);
     }
    
    public double multiplication(double[ ] value)
    {
        double total = 1;
        
          for(int i=0; i<nums.length; i++)
          {
              total = total * value[ i ];
          }
        return (total);
     }
    
    public double division(double [ ] value){
        double total = 1;
            for(int i=0; i<nums.length; i++)
          {
              total = total / value[ i ];
          }
          return (total);
     }
    
}


public class CalculatorLand {

    public static void main(String[] args) throws IOException {
        int arraySize = 0;
        Calculator calc = new Calculator();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the amount of numbers: ");
        arraySize = Integer.parseInt(reader.readLine());
        calc.setVarAmount(arraySize);
        
        for(int i = 0; calc.getVarAmount()> i; i++){
            System.out.println("Enter Number: ");
            calc.nums[i] = Double.parseDouble(reader.readLine());
        }
        
        System.out.println("Which operator do you want to use (+, -, *, / ):");
        calc.setOper((char) reader.read());
        switch(calc.getOper()){
            case '+':System.out.println("Your total is: " + calc.addition(calc.nums));
                break;
            case '-':System.out.println("Your total is: " + calc.subtraction(calc.nums));
                break;
            case '*':System.out.println("Your total is: " + calc.multiplication(calc.nums));
                break;
            case '/':System.out.println("Your total is: " + calc.division(calc.nums));
                break;
            default:System.out.println("Invalid Operator");
                break;
        }
        
    }
    
}


