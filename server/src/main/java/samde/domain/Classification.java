package samde.domain;

public class Classification {

    private final Status status;

    public Classification(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public enum Status {
        MALICIOUS, BENIGN, UNKNOWN;
    }
}
