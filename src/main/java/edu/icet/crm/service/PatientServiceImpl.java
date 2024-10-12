package edu.icet.crm.service;

import edu.icet.crm.model.Patient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {
    ArrayList<Patient> patientList = new ArrayList<>();
    @Override
    public List<Patient> getpatient() {

        return patientList;
    }

    @Override
    public void addpatient(Patient patient) {

        patientList.add(patient);
    }
}
