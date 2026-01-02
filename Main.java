import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ViewerInterface viewer1=new Viewer();
        ViewerInterface viewer2=new Viewer();
        //Scanner method
        Scanner scanner=new Scanner(System.in);
        //value for viewer 1
        System.out.println("==========VIEWER1============");
        System.out.println("Enter the no.of Seats:");
        BigInteger inputNoFoSeats1=new BigInteger(scanner.nextLine());
        viewer1.setNumberOfSeats(inputNoFoSeats1.intValue());
        System.out.println("Enter the Screen type:");
        String inputScreenTyp1=scanner.nextLine();
        viewer1.setScreenType(inputScreenTyp1);
        System.out.println("Enter the Snacks want or not:");
        String inputWantSnacks1=scanner.nextLine();
        viewer1.setWantSnacks(inputWantSnacks1);
        System.out.println("Enter the Count of snacks");
       BigInteger inputSnackQuantity1=new BigInteger(scanner.nextLine());
       viewer1.setSnackQuantity(inputSnackQuantity1.intValue());
        //value for viewer 2
        System.out.println("==========VIEWER2============");
        System.out.println("Enter the no.of Seats:");
        BigInteger inputNoFoSeats2=new BigInteger(scanner.nextLine());
        viewer2.setNumberOfSeats(inputNoFoSeats2.intValue());
        System.out.println("Enter the Screen type:");
        String inputScreenTyp2=scanner.nextLine();
        viewer2.setScreenType(inputScreenTyp2);
        System.out.println("Enter the Snacks want or not:");
        String inputWantSnacks2=scanner.nextLine();
        viewer2.setWantSnacks(inputWantSnacks2);
        System.out.println("Enter the Count of snacks");
        BigInteger inputSnackQuantity2=new BigInteger(scanner.nextLine());
        viewer2.setSnackQuantity(inputSnackQuantity2.intValue());

       if (viewer1.getScreenType().equals("Gold")){
           System.out.println("==========VIEWER1============");
           ScreenInterface gold=new GoldScreen("MG123",500,150,100,viewer1);
           //viewer1.setGold(gold);
           ScreenInterface [] arr=viewer1.getScreen();
           arr[0]=gold;
           System.out.println("BookingID:");
           System.out.println(arr[0].getBookingId());
           //method 1
           gold.calculateTicketPrice();
           System.out.println("Ticket Price:");
           System.out.println(arr[0].getTicketPrice());
           //method 2
           gold.calculateSnackPrice();
           //method 3
           gold.generateBill();
           System.out.println("Total Bill");
           System.out.println(arr[0].getTotalBill());
           //method 3
           gold.applyDiscount();
       }
        else if (viewer1.getScreenType().equals("Silver")){
           System.out.println("==========VIEWER1============");
            ScreenInterface silver=new SilverScreen("MS123",200,80,50,viewer1);
            //viewer1.setSilver(silver);
           ScreenInterface [] arr=viewer1.getScreen();
           arr[1]=silver;
            //method 1
           System.out.println("BookingID:");
           System.out.println(arr[1].getBookingId());
            silver.calculateTicketPrice();
            System.out.println("Ticket Price:");
            System.out.println(arr[1].getTicketPrice());
            //method 2
            silver.calculateSnackPrice();
            //method 3
            silver.generateBill();
            System.out.println("Total Bill");
            System.out.println(arr[1].getTotalBill());
            //method 3
            silver.applyDiscount();
        }
        else {
           System.out.println("==========VIEWER1============");
           System.out.println("Screen type is not valid");
       }
        if (viewer2.getScreenType().equals("Gold")){
            System.out.println("==========VIEWER2============");
            ScreenInterface gold=new GoldScreen("MG123",500,150,100,viewer2);
            //viewer2.setGold(gold);
            ScreenInterface [] arr=viewer2.getScreen();
            arr[0]=gold;
            System.out.println("BookingID:");
            System.out.println(arr[1].getBookingId());
            //method 1
            gold.calculateTicketPrice();
            System.out.println("Ticket Price:");
            System.out.println(arr[1].getTicketPrice());
            //method 2
            gold.calculateSnackPrice();
            //method 3
            gold.generateBill();
            System.out.println("Total Bill");
            System.out.println(arr[1].getTotalBill());
            //method 3
            gold.applyDiscount();
        }
        else if (viewer2.getScreenType().equals("Silver")){
            System.out.println("==========VIEWER2============");
            ScreenInterface silver=new SilverScreen("MS123",200,80,50,viewer2);
            //viewer2.setSilver(silver);
            ScreenInterface []arr=viewer2.getScreen();
            arr[1]=silver;
            //method 1
            System.out.println("BookingID:");
            System.out.println(arr[1].getBookingId());
            silver.calculateTicketPrice();
            System.out.println("Ticket Price:");
            System.out.println(arr[1].getTicketPrice());
            //method 2
            silver.calculateSnackPrice();
            //method 3
            silver.generateBill();
            System.out.println("Total Bill");
            System.out.println(arr[1].getTotalBill());
            //method 3
            silver.applyDiscount();
        }
        else {
            System.out.println("==========VIEWER2============");
            System.out.println("Screen type is not valid");
        }

    }
}