package edu.icet.crm.service.Impl;

import edu.icet.crm.entity.PatientEntity;
import edu.icet.crm.model.Patient;
import edu.icet.crm.repository.PatientRepository;
import edu.icet.crm.service.PatientService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

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

    @Override
    public List<Patient> searchByaddress(String address) {
        ArrayList<Patient> findAddress = new ArrayList<>();
        for (PatientEntity byaddress : repository.findByaddress(address)) {
            findAddress.add(mapper.map(byaddress,Patient.class));
        }
        return findAddress;

    }

    @Override
    public List<Patient> searchByNic(String nic) {

        ArrayList<Patient> findByNic = new ArrayList<>();
        for (PatientEntity bynic : repository.findByNic(nic)) {
            findByNic.add(mapper.map(bynic,Patient.class));
        }
            return findByNic;
    }
}
