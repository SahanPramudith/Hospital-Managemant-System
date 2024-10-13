package edu.icet.crm.service;

import edu.icet.crm.entity.PatientEntity;
import edu.icet.crm.model.Patient;
import edu.icet.crm.repository.PatientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    PatientRepository repository;
    @Autowired
    ModelMapper mapper;

    @Override
    public List<Patient> getpatient() {
        ArrayList<Patient> patientArrayList = new ArrayList<>();
        for (PatientEntity patientEntity : repository.findAll()) {
            patientArrayList.add(mapper.map(patientEntity, Patient.class));
        }
        return patientArrayList;
    }

    @Override
    public void addpatient(Patient patient) {
        repository.save(mapper.map(patient, PatientEntity.class));
    }

    @Override
    public void deletepatient(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public ArrayList<PatientEntity> search(String name) {
        ArrayList<PatientEntity> namesearch = new ArrayList<>();
        for (PatientEntity patientEntity : repository.findByname(name)) {
            namesearch.add(patientEntity);
        }
        return namesearch;
    }
}
