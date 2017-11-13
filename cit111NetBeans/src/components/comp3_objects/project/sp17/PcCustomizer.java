package components.comp3_objects.project.sp17;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CustomPC {
    public String owner = "Batman";
    public String color = "Justice";
    public String brand = "ComBat";
    public double screenSize;
    public double processSpeed;
    public double addition;
    public double subtraction;
    public double multiplication;  
    public double division;
    public int numericChoice;
    public int x;
    public int y;
  
    ///////////////////////////////////////////////////////////////////////////
    
    public double computer()throws IOException{
    
        try {
        BufferedReader lineReader = new BufferedReader
                (new InputStreamReader(System.in));
        numericChoice = Integer.parseInt(lineReader.readLine());
    } catch (IOException e) {
     System.out.println("WRONG!" + e.getMessage());
    } catch(NumberFormatException e) {
     System.out.println("WRONG!" + e.getMessage());
    }
    
        return numericChoice;
        } //close method
    ////////////////////////////////////////////////////////////////////////////
    
        public String owner() throws IOException {
            System.out.println("The owner of this computer is: ");
            BufferedReader reader =
                    new BufferedReader (new InputStreamReader(System.in));
            String ownerName = reader.readLine();
            owner = ownerName;
            return owner;
        }
///////////////////////////////////////////////////////////////////////////////
        public String color() throws IOException {
            System.out.println("The color of this computer is: ");
            BufferedReader reader =
                    new BufferedReader (new InputStreamReader(System.in));
            String computerColor = reader.readLine();
            color = computerColor;
            return computerColor;
        }
///////////////////////////////////////////////////////////////////////////////
        public String brand() throws IOException {
            System.out.println("The brand of this computer is: ");
            BufferedReader reader =
                    new BufferedReader (new InputStreamReader(System.in));
            String computerBrand = reader.readLine();
            brand = computerBrand;
            return computerBrand;
        }
///////////////////////////////////////////////////////////////////////////////
        public String screenSize() throws IOException {
            System.out.println("The size of the screen is: ");
            BufferedReader reader =
                    new BufferedReader (new InputStreamReader(System.in));
            String size = reader.readLine();
            screenSize = Double.parseDouble(size);
            return size;
        }
///////////////////////////////////////////////////////////////////////////////
        public String processSpeed() throws IOException {
            System.out.println("The processing speed of this computer is: ");
            BufferedReader reader =
                    new BufferedReader (new InputStreamReader(System.in));
            String speed = reader.readLine();
            processSpeed = Double.parseDouble(speed);
            return speed;
        }
///////////////////////////////////////////////////////////////////////////////
        public void displayStats() {
            System.out.println("Owner name: " + owner
            +"\nComputer color: " + color
            +"\nComputer brand: " + brand
            +"\nScreen size: " + screenSize
            +"\nProcess speed: " + processSpeed);
            
        
        }
        
} //close class
    
public class PcCustomizer{
    public static void main(String[] args) throws IOException {
        CustomPC computer1 = new CustomPC();

computer1.owner();
        
        computer1.color();
        
        computer1.brand();
        
        computer1.screenSize();
        
        computer1.processSpeed();
        
        computer1.displayStats();
    } // close main
}