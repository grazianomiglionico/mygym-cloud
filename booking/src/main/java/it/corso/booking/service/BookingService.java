package it.corso.booking.service;

import it.corso.booking.model.Booking;
import it.corso.booking.model.dto.BookingDto;

public interface BookingService {

    Booking save(BookingDto bookingDto);
}
