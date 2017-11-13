package components.comp3_objects.project.sp17;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CellPhoneRepairTicket {
    private String userName;
    private String deviceType;
    private String deviceProblem;
    private String userLocation;
    private String insurance;
    private int repairShop;
    private double repairShopControl; // attempt to limit what number you put in for repair shop
    
    public CellPhoneRepairTicket(String userName, String deviceType, String deviceProblem, String userLocation, String insurance, int repairShop){
        this.userName = userName;
        this.deviceType = deviceType;
        this.userLocation = userLocation;
        this.deviceProblem = deviceProblem;
        this.insurance = insurance;
        this.repairShop = repairShop;
    } // end public objectproject
     private CellPhoneRepairTicket(){
     }

     public void setUserName(String userName){
     this.userName = userName;
     }
     public String getUserName(){
     return userName;
     }
     ///////////////////////////////////////////////////////////////////////////
       public void setDeviceType(String deviceType){
     this.deviceType = deviceType;
     }
     public String getDeviceType(){
     return deviceType;
     }
     ///////////////////////////////////////////////////////////////////////////
       public void setUserLocation(String userLocation){
     this.userName = userName;
     }
     public String getUserLoation(){
     return userLocation;
     }
     ///////////////////////////////////////////////////////////////////////////
      public void setDeviceProblem(String deviceProblem){
     this.deviceProblem = deviceProblem;
     }
     public String getDeviceProblem(){
     return deviceProblem;
     }
     ///////////////////////////////////////////////////////////////////////////
        public void setInsurance(String insurance){
     this.insurance = insurance;
     }
     public String getInsurance(){
     return insurance;
     } 
    ////////////////////////////////////////////////////////////////////////////
      public int getRepairShop() {
        return repairShop;
    }

    public void setRepairShop(int repairShop) {
        this.repairShop = repairShop;
    }
    ////////////////////////////////////////////////////////////////////////////
     double getRepairShopControl() {
        return repairShopControl;
    }

    public void setRepairShopControl(int repairShopControl) {
        this.repairShopControl = repairShopControl;
    }
    ////////////////////////////////////////////////////////////////////////////
    
    
       private String RepairShop(double amt){ 
    repairShopControl += amt;
        if(repairShopControl > 4){
            repairShopControl = 4;
        }    
            return "invalid responce try again";
       }
    
    public static void main(String[] args) throws IOException, UnsupportedOperationException {
        String getinfo;
        int getnumber;
        
        BufferedReader lineReader = new BufferedReader(new InputStreamReader(System.in)); 
        
        CellPhoneRepairTicket phoneDiagnositc = new CellPhoneRepairTicket();
     System.out.println("Welcome to the Phone Diagnostic. \nWe will be able to identify your problem!");
     System.out.println("To get us started we will need to know some basic information\n" +
             " We will start with who you are: ");
     
     getinfo = (lineReader.readLine());
     phoneDiagnositc.setUserName(getinfo);
     
     System.out.println("Perfect! Next step is to get your Device Type: ");
      
        getinfo = (lineReader.readLine());
     phoneDiagnositc.setDeviceType(getinfo);
     
     System.out.println("Now we need to know where you are located, so after we find your problem we can send you to a repair shop: ");
     
       getinfo = (lineReader.readLine());
     phoneDiagnositc.setUserLocation(getinfo); 
     
     System.out.println("The most important step is for you to describe your problem to us: ");
     
     getinfo = (lineReader.readLine());
     phoneDiagnositc.setDeviceProblem(getinfo); 
     
     System.out.println("We need to know if you have any insurance on your phone: ");
     
     getinfo = (lineReader.readLine());
     phoneDiagnositc.setInsurance(getinfo); 
   
     System.out.println("Choose what repair shop you want by typing in a number provided");
     System.out.println("1. UBreakIFix, 3.3 miles away ");
     System.out.println("2. WeFixIt in Batteries Plus Blubs, 2.9 miles away");
     System.out.println("3. Dr.PhoneFix in Walmart, 2.8 miles away");
     System.out.println("4. The Apple Store, 14.1 miles away");
     
     getnumber = Integer.parseInt(lineReader.readLine());
        
        phoneDiagnositc.setRepairShop(getnumber);
    
      System.out.println("Thank you for your repair shop selection!");
      System.out.println("Your information has been sent to the repair shop, and they are awaiting your arrival");
      System.out.println("Have a wonderful day!!");
      
      
      } 
}//End Public class CellPhoneRepairTicket
