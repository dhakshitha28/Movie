public class GoldScreen extends Screen implements GoldScreenInterface{
    public GoldScreen(String bookingId,int ticketPrice,int snackPrice,int convenienceFee,ViewerInterface viewer){
        this.setBookingId(bookingId);
        this.setTicketPrice(ticketPrice);
        this.setSnackPrice(snackPrice);
        this.setConvenienceFee(convenienceFee);
        this.setViewer(viewer);
    }

}