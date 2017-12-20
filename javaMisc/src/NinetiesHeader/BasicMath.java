package NinetiesHeader;

public class BasicMath {
    public static void main(String[] args){
        int a = 6;
        int b = 4;
        
        int result = doMath(b, a);
        
        result = result + 1;
        
        // output is 19
        System.out.println("First Result: " + result);
               
        int secondResult = doTrickierMath(result, b);
        // output is 98
        System.out.println("Second Result: " + secondResult);
        
    } // close main
    
    public static int doMath(int x, int y){
        
        return ((x + 2) * 2) + y;
    } // close doMath
     
    public static int doTrickierMath(int r, int q){
        int temp = Math.abs(r - q) * 3;
        return doMath(temp, q);
    } // close doTrickierMath
} // close class









