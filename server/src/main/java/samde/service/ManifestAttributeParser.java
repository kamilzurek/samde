package samde.service;

import java.util.List;

public interface ManifestAttributeParser {

    List<String> parse(byte[] manifestContent);

    List<String> parse(String manifestContent);

}
