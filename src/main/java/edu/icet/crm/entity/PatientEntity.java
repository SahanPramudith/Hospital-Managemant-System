package edu.icet.crm.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class PatientEntity {

    private Integer id;
    private String name;
    private String nic;
    private String address;
    private String bloodGrop;
    private String category;
    private String gender;
    private String contact ;
    private String note;
    private String age;
    private String allergic;
}
