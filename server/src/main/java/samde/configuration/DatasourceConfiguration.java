package samde.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan(basePackages = "samde.model")
@EnableTransactionManagement
@EnableCaching
public class DatasourceConfiguration {
}
