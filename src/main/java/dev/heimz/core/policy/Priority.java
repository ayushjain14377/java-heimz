package dev.heimz.core.policy;

public enum Priority {
    P1(1),
    P2(2),
    P3(3),
    P4(4);

    private int value;

    Priority(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}