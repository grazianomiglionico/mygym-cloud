package it.corso.booking.service;

import it.corso.booking.client.MyGymClient;
import it.corso.booking.dao.BookingRepository;
import it.corso.booking.model.Booking;
import it.corso.booking.model.dto.BookingDto;
import it.corso.booking.model.dto.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private MyGymClient client;

    @Override
    public Booking save(BookingDto bookingDto) {
        ModelMapper modelMapper = new ModelMapper();

        // TODO recupero l'utente tramite l'id
        // UserDto userDto = client.findById(bookingDto.getId()).getBody();

        /*// TODO controllo se l'utente è attivo
        if(userDto.isActiveFlag()){
            // TODO controllo se l'utente ha un abbonamento attivo
            if(client.subscriptionActive(bookingDto.getUser())){
                // TODO salva la prenotazione
            } else {
                //TODO NON HAI UN ABBONAMENTO ATTIVO --> exception || messaggio semplice
            }
        } else {
            //TODO L'UTENTE NON è ATTIVO --> exception || messaggio semplice
        }*/

        // return bookingRepository.save(modelMapper.map(bookingDto, Booking.class));
        return null;
    }
}
