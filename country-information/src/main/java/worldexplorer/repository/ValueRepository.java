package worldexplorer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import worldexplorer.entity.Value;

@Repository
public interface ValueRepository extends JpaRepository<Value,Long> {
}
