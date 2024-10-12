package edu.icet.crm.controller;

import edu.icet.crm.model.Patient;
import edu.icet.crm.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PatientController {

    @Autowired
    PatientService service;

    @PostMapping("patient-save")
    void savePatien(@RequestBody Patient patient){
        service.addpatient(patient);
        System.out.println(patient);
    }

    @GetMapping("patient-get")
    List<Patient> getPatient(){
        List<Patient> getpatient = service.getpatient();
        return getpatient;

    }
}
