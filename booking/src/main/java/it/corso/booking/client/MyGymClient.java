package it.corso.booking.client;

import it.corso.booking.model.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "mygym", url = "http://localhost:9001/")
public interface MyGymClient {

    @GetMapping("/users/{id}")
    ResponseEntity<UserDto> findById(@PathVariable(value = "id") Long id);

    @GetMapping("/users/findByActiveFlagTrueAndActiveSubscription")
    ResponseEntity<List<UserDto>> findByActiveFlagTrueAndActiveSubscription();

}
