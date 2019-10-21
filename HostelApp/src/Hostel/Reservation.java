package Hostel;

public class Reservation {
	private String reservationCode;
	private int numberOfGuests;
        private LocalDate reservationDate;
        private LocalDate checkinDate;
        private LocalDate checkoutDate;

        //RELATIONS TO OTHER CLASSES
        private Room reservedRooms[];
        private Payment reservationPayment;
	
	
	
	Payment createPayment(String type) {
		this.reservationPayment=reservationPayment.createPayment(type);
		return this.reservationPayment;
	}
	
	double calculateTotalAmount() {
		return reservationPayment.calculateTotalAmount();
	}
	
}
