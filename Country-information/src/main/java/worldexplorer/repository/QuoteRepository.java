package worldexplorer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import worldexplorer.entity.Quote;
import worldexplorer.repository.custom_operations.QuoteOperation;

@Repository
public interface QuoteRepository extends JpaRepository<Quote, Long>, QuoteOperation {
}
