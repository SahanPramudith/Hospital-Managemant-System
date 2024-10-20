package edu.icet.crm.controller;

import edu.icet.crm.service.AppointmentSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appointment")

public class Appointment {

    @Autowired
    AppointmentSevice sevice;

    @PostMapping("/save")
    void addAppoitment(@RequestBody Appointment appointment){
        sevice.save(appointment);
    }
    @PostMapping("/update")
    void updateAppoinment(@RequestBody Appointment appointment){
        sevice.save(appointment);
    }
    @ResponseStatus(HttpStatus.ACCEPTED)
    @DeleteMapping("delete/{id}")
    void delete(@PathVariable Integer id){
        sevice.deleteById(id);
    }


}
