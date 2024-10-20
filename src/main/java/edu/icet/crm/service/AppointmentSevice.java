package edu.icet.crm.service;

import edu.icet.crm.controller.Appointment;

public interface AppointmentSevice {
    void save(Appointment appointment);

    void deleteById(Integer id);
}
