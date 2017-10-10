package javamisc;

public class BasicMath {
    public static void main(String[] args){
        int a = 6;
        int b = 4;
        
        int result = doMath(b, a);
        
        result = result + 1;
        
        System.out.println(result);
    }
    
    public static int doMath(int x, int y){
        
        return ((x + 2) * 2) + y;
    }
} 





