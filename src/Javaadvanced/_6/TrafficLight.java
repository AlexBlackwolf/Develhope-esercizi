package javaadvanced._6;

public enum TrafficLight { RED, YELLOW, GREEN ;

    private static final TrafficLight[] values = values();
    private int index = 0;

    public TrafficLight next() {
        index = (index + 1) % values.length;
        return values[index];

    }
}
