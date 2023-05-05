package BroCodeCourse.CopyObjects;

public class Sword {
    private String type;
    private String metal;
    private int year;

    public Sword(String type, String metal, int year) {
        this.setType(type);
        this.setMetal(metal);
        this.setYear(year);
    }
    /**method 2*/
    Sword(Sword x){
        this.copy(x);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    /** mehtod 1**/
    public void copy(Sword x) {
        this.setType(x.getType());
        this.setMetal(x.getMetal());
        this.setYear(x.getYear());
    }

    @Override
    public String toString() {
        return "Sword" +
                "type: '" + type + '\'' +
                ", metal: '" + metal + '\'' +
                ", year: " + year +
                "";
    }
}
