package samde.repository;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import samde.model.LogisticModelTree;

public interface LogisticModelTreeRepository extends JpaRepository<LogisticModelTree, Integer> {

    @Cacheable("models")
    LogisticModelTree findFirstByOrderByVersion();

}
