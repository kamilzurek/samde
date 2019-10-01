package samde.service.impl;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import samde.domain.AttributeInstance;
import samde.domain.Classification;
import samde.model.LogisticModelTree;
import samde.repository.LogisticModelTreeRepository;
import samde.service.ClassificationService;
import weka.classifiers.Classifier;
import weka.classifiers.trees.LMT;
import weka.core.Instance;
import weka.core.SerializationHelper;

import java.io.ByteArrayInputStream;

import static org.slf4j.LoggerFactory.getLogger;

@Service
@Transactional
public class ClassificationServiceImpl implements ClassificationService {
    
    private static final Logger logger = getLogger(ClassificationServiceImpl.class);

    private final LogisticModelTreeRepository modelRepository;

    @Autowired
    public ClassificationServiceImpl(LogisticModelTreeRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    @Override
    public Classification classify(AttributeInstance attributeInstance) {
        Classification.Status status = Classification.Status.UNKNOWN;
        LogisticModelTree model = modelRepository.findFirstByOrderByVersion();
        try {
            Classifier classifier =
                    (LMT) SerializationHelper.read(new ByteArrayInputStream(model.getModel()));
            Instance instance = attributeInstance.getInstance();
            double result = classifier.classifyInstance(instance);
            String classificationResult = instance.dataset().classAttribute().value((int) result);
            status = Classification.Status.valueOf(classificationResult.toUpperCase());
            logger.info("CLASSIFIER: {}", classifier.toString());
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }

        return new Classification(status);
    }

    @Override
    public void saveModel(LogisticModelTree model) {
        modelRepository.save(model);
    }
}
