package edu.icet.crm.repository;

import edu.icet.crm.entity.AppoinmentEntity;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.repository.CrudRepository;

public interface AppoinmenteRepository extends CrudRepository<AppoinmentEntity, Integer> {
}
