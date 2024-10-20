package edu.icet.crm.service;

import edu.icet.crm.entity.PatientEntity;
import edu.icet.crm.model.Patient;

import java.util.ArrayList;
import java.util.List;

public interface    PatientService {
    List<Patient> getpatient();

    void addpatient(Patient patient);

    void deletepatient(Integer id);

    ArrayList<PatientEntity> search(String name);

    List<Patient> searchByaddress(String address);

    List<Patient> searchByNic(String nic);
}
