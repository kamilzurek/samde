package samde.service;

import samde.domain.AttributeInstance;
import samde.domain.Classification;
import samde.model.LogisticModelTree;

public interface ClassificationService {

    Classification classify(AttributeInstance attributeInstance);

    void saveModel(LogisticModelTree model);

}
