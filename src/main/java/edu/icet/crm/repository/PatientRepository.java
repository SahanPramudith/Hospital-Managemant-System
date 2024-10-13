package edu.icet.crm.repository;

import edu.icet.crm.entity.PatientEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PatientRepository extends CrudRepository<PatientEntity,Integer> {
    List<PatientEntity> findByname(String name);
}
