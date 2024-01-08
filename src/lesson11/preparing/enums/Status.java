package lesson11.preparing.enums;

public enum Status {
    IN_PROGRESS(1) {
        @Override
        public int getValue() {
            return super.getValue() - 1;
        }
    },
    DONE(2),
    FAILED(3);


    private int value;


    Status(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
