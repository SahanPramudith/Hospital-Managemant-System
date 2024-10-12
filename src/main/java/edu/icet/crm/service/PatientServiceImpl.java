package edu.icet.crm.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.entity.PatientEntity;
import edu.icet.crm.model.Patient;
import edu.icet.crm.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {


    @Autowired
    PatientRepository repository;

    @Autowired
    ObjectMapper mapper;

    ArrayList<Patient> patientList = new ArrayList<>();
    @Override
    public List<Patient> getpatient() {

        return patientList;
    }

    @Override
    public void addpatient(Patient patient) {

        PatientEntity patientEntity = mapper.convertValue(patient, PatientEntity.class);

        repository.save(patientEntity);

    }
}
