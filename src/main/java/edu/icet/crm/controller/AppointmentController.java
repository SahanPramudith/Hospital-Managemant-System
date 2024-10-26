package edu.icet.crm.controller;

import edu.icet.crm.model.Appointment;
import edu.icet.crm.service.AppoimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    AppoimentService service;

    @PostMapping("/save")
    void postAppointment(@RequestBody Appointment appointment){
        service.save(appointment);

    }
}
