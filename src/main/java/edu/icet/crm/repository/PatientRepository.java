package edu.icet.crm.repository;

import edu.icet.crm.entity.PatientEntity;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<PatientEntity,Integer> {
}
