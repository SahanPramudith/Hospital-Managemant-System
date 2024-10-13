package edu.icet.crm.service;

import edu.icet.crm.model.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getpatient();

    void addpatient(Patient patient);

    void deletepatient(Integer id);
}
