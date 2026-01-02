public class SilverScreen extends Screen implements SilverScreenInterface{
    public SilverScreen(String bookingId,int ticketPrice,int snackPrice,int convenienceFee,ViewerInterface viewer){
        this.setBookingId(bookingId);
        this.setTicketPrice(ticketPrice);
        this.setSnackPrice(snackPrice);
        this.setConvenienceFee(convenienceFee);
        this.setViewer(viewer);
    }

}