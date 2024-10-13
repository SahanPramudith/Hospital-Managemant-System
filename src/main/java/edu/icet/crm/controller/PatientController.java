package edu.icet.crm.controller;

import edu.icet.crm.entity.PatientEntity;
import edu.icet.crm.model.Patient;
import edu.icet.crm.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class PatientController {

    @Autowired
    PatientService service;

    @PostMapping("patient-save")
    @ResponseStatus(HttpStatus.CREATED)
    void savePatien(@RequestBody Patient patient){
        service.addpatient(patient);
        System.out.println(patient);
    }

    @GetMapping("patient-get")
    List<Patient> getPatient(){
        return service.getpatient();
    }

    @DeleteMapping("delete/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    void deletPatient(@PathVariable Integer id){
        service.deletepatient(id);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.ACCEPTED)
    void updatepatient(@RequestBody Patient patient){
        service.addpatient(patient);
        System.out.println(patient);
    }

    @GetMapping("search/{name}")
    ArrayList<PatientEntity> search(@PathVariable String name){
        return service.search(name);
    }
    @GetMapping("search-By-address/{address}")
    List<Patient>searchByAddress(@PathVariable String address){
        return service.searchByaddress(address);
    }

}
