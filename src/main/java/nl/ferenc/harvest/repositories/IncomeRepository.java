package nl.ferenc.harvest.repositories;

import nl.ferenc.harvest.models.Income;
import org.springframework.data.repository.CrudRepository;

public interface IncomeRepository extends CrudRepository<Income, Long> {
}
