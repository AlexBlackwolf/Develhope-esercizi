package BroCodeCourse.Encapsulation;

public class Sword {
    private String type;
    private String metal;
    private int year;
    Sword(String type, String metal, int year) {
        this.setType(type);
        this.setMetal(metal);
        this.setYear(year);
    }
    public String getType() {
        return type;
    }

    public String getMetal() {
        return metal;
    }

    public int getYear() {
        return year;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
