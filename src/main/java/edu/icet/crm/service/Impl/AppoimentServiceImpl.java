package edu.icet.crm.service.Impl;

import edu.icet.crm.controller.Appointment;
import edu.icet.crm.entity.AppoinmentEntity;
import edu.icet.crm.repository.AppoinmenteRepository;
import edu.icet.crm.service.AppointmentSevice;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class AppoimentServiceImpl implements AppointmentSevice {

    @Autowired
    AppoinmenteRepository repository;
    @Autowired
    ModelMapper mapper;


    @Override
    public void save(Appointment appointment) {
        repository.save(mapper.map(appointment, AppoinmentEntity.class));
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
