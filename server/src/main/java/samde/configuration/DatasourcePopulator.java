package samde.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import samde.Utils;
import samde.model.LogisticModelTree;
import samde.service.ClassificationService;
import samde.service.UserService;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Populates database with versioned classification models.
 */
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class DatasourcePopulator implements ApplicationRunner {

    private final ClassificationService classificationService;
    private final UserService userService;

    @Autowired
    public DatasourcePopulator(ClassificationService classificationService, UserService userService) {
        this.classificationService = classificationService;
        this.userService = userService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        File[] modelDirs = new ClassPathResource("/model").getFile().listFiles();
        if (Utils.isArrayEmpty(modelDirs)) {
            throw new IllegalStateException("no model found");
        }

        for (File modelDir : modelDirs) {
            String version = modelDir.getName();
            File modelFile = modelDir.listFiles()[0];

            byte[] content = new byte[(int) modelFile.length()];
            InputStream is = new FileInputStream(modelFile);
            is.read(content);
            is.close();

            LogisticModelTree lmt = new LogisticModelTree(version, content);
            classificationService.saveModel(lmt);
        }

        userService.saveUser("user", "password123");
    }

}
