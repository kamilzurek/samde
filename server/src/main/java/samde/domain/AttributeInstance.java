package samde.domain;

import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AttributeInstance {

    private Instance instance;
    private Attributes attributes;

    public AttributeInstance(List<String> requestedPermissions) {
        instance = new DenseInstance(169);
        attributes = Attributes.newInstance();
        preFillInstance(requestedPermissions);
    }

    private void preFillInstance(List<String> requestedPermissions) {
        Set<String> requestedPermissionsSet = new HashSet<>(requestedPermissions);
        ArrayList<Attribute> attrs = new ArrayList<>(170);
        ArrayList<String> classes = new ArrayList<String>(2);
        classes.add(Classification.Status.BENIGN.name().toLowerCase());
        classes.add(Classification.Status.MALICIOUS.name().toLowerCase());

        int index = 0;
        for (String key : attributes.getAttributes().keySet()) {
            Attribute attribute = new Attribute(key, index++);
            attrs.add(attribute);
            instance.setValue(attribute, requestedPermissionsSet.contains(key) ? 1d : 0d);
        }

        Attribute classAttr = new Attribute("clazz", classes);
        attrs.add(classAttr);

        Instances permissions = new Instances("permissions", attrs, 0);
        permissions.setClassIndex(classAttr.index());

        instance.setDataset(permissions);
    }

    public Instance getInstance() {
        return instance;
    }

}
