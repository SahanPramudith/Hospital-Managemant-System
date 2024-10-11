package edu.icet.crm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Patient {

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
