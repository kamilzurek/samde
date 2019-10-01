package samde.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import samde.domain.AttributeInstance;
import samde.domain.Classification;
import samde.service.ClassificationService;
import samde.service.ManifestAttributeParser;

import javax.validation.constraints.NotEmpty;
import java.util.List;

import static org.apache.tomcat.util.codec.binary.Base64.decodeBase64;

@RestController
public class ClassificationRestController {

    private final ManifestAttributeParser manifestAttributeParser;
    private final ClassificationService classificationService;

    @Autowired
    public ClassificationRestController(ManifestAttributeParser manifestAttributeParser,
                                        ClassificationService classificationService) {
        this.manifestAttributeParser = manifestAttributeParser;
        this.classificationService = classificationService;
    }

    @PostMapping("/classify")
    public Classification classify(@RequestParam(value="content") @NotEmpty String content) throws Exception {
        byte[] decodedContent = decodeBase64(content);
        List<String> requestedPermissions = manifestAttributeParser.parse(decodedContent);
        AttributeInstance attributeInstance = new AttributeInstance(requestedPermissions);
        return classificationService.classify(attributeInstance);
    }

}
