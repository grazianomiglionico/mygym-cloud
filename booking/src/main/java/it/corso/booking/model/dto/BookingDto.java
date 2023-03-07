package it.corso.booking.model.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
public class BookingDto {

    private Long id;

    LocalDate date;

    LocalDateTime timestamp;

    private Long user;
}
