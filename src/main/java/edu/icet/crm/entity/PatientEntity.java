package edu.icet.crm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@Table(name = "patient")
public class PatientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
