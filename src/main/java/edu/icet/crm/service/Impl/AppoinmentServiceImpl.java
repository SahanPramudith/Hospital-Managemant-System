package edu.icet.crm.service.Impl;

import edu.icet.crm.entity.AppoinmentEntity;
import edu.icet.crm.model.Appointment;
import edu.icet.crm.repository.AppoinmenteRepository;
import edu.icet.crm.service.AppoimentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppoinmentServiceImpl implements AppoimentService {

    @Autowired
    AppoinmenteRepository repository;
    @Autowired
    ModelMapper mapper;


    @Override
    public void save(Appointment appointment) {
        repository.save(mapper.map(appointment, AppoinmentEntity.class));
    }
}
