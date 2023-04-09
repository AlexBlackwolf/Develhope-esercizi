package javaadvanced._6;

enum Seasons {
    SPRING(new String[]{"March", "April", "May"}),
    SUMMER(new String[]{"June", "July", "August"}),
    FALL(new String[]{"September", "October", "November"}),
    WINTER(new String[]{"December", "January", "February"});
    private final String[] months;
    Seasons(String[] months) {
        this.months = months;
    }
    public String[] getMonths() {
        return months;
    }
}
