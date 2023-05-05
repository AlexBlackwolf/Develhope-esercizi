package BroCodeCourse.Switch;

public class Switch {
    public static void main(String[] args) {
        String day = "Friday";
        switch(day){
            case "Sunday":System.out.println("its Sunday");
            break;
            case "Monday":System.out.println("Its Monday");
            break;
            case"Tuesday" :System.out.println("its Tuesday");
            break;
            case"Wenesday":System.out.println("its Wenesday");
            break;
            case"Thurday":System.out.println("its Thursday");
            break;
            case"Friday":System.out.println("its Friday");
            break;
            case"Saturday":System.out.println("its Saturday");
            default:System.out.println("that is not a day");

        }
    }
}
