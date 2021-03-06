package samde.service.impl;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import samde.service.ManifestAttributeParser;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

@Service
public class ManifestAttributeParserImpl implements ManifestAttributeParser {

    private static final Logger logger = getLogger(ManifestAttributeParserImpl.class);

    private static final String XML_PERMISSION_ATTR = "name";
    private static final String XML_PERMISSION_XPATH = "/manifest/uses-permission";

    @Override
    public List<String> parse(byte[] manifestContent) {
        return parse(new String(manifestContent));
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<String> parse(String manifestContent) {
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(new StringReader(manifestContent));
            List<Element> permissions = (List<Element>) document.selectNodes(XML_PERMISSION_XPATH);
            List<String> requestedPermissions = new ArrayList<>(permissions.size());
            for (Element permission : permissions) {
                String perm = permission.attributeValue(XML_PERMISSION_ATTR);
                requestedPermissions.add(perm);
            }
            logger.info("Requested permissions: {}", requestedPermissions);
            return requestedPermissions;
        } catch (DocumentException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

}
