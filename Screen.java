public abstract class Screen implements ScreenInterface{
    //Known
    private String bookingId;
    private int ticketPrice;
    private int snackPrice;
    private int totalBill;
    private int convenienceFee;
    //unKnown
//    private int numberOfSeats;
//    private String wantsSnacks;
//    private int snackQuantity;
    private ViewerInterface viewer;
    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getSnackPrice() {
        return snackPrice;
    }

    public void setSnackPrice(int snackPrice) {
        this.snackPrice = snackPrice;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }

    public int getConvenienceFee() {
        return convenienceFee;
    }

    public void setConvenienceFee(int convenienceFee) {
        this.convenienceFee = convenienceFee;
    }

    public ViewerInterface getViewer() {
        return viewer;
    }

    public void setViewer(ViewerInterface viewer) {
        this.viewer = viewer;
    }
    //method 1
    public void calculateTicketPrice(){
        this.ticketPrice=this.viewer.getNumberOfSeats()*this.ticketPrice;
    }
    //method 2
    public void calculateSnackPrice(){
        if(this.viewer.getWantSnacks().equals("YES")) {
            this.snackPrice = this.viewer.getSnackQuantity() * this.snackPrice;
            System.out.println("Snack Price");
            System.out.println(this.snackPrice);
        }
        else if(this.viewer.getWantSnacks().equals("NO")){
            System.out.println("Snack Price:0");
        }
        else {
            System.out.println("Snack detail is not given ");
        }
    }
    //method 3
    public void generateBill(){
        this.totalBill=this.ticketPrice+this.snackPrice+this.convenienceFee;
    }
    //method 4
    public void applyDiscount(){
        if(this.viewer.getNumberOfSeats()>=4){
            /*
             Formula:
                    Discount = Original Price × 10 / 100
                    Final Price = Original Price − Discount
             */
            int Discount=this.totalBill*10/100;
            this.totalBill=this.totalBill-Discount;
            System.out.println("Discount Applied");
            System.out.println(this.totalBill);
        }
        else {
            System.out.println("No Discount");
        }
    }
}