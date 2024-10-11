package edu.icet.crm.controller;

import edu.icet.crm.model.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PatientController {

    @PostMapping("patient-save")
    void savePatien(@RequestBody Patient patient){
        System.out.println(patient);
    }


}
