package BroCodeCourse.ForLoop;

//for loop execute a block of code a limited amount of times
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        for(int i = 10; i >=0; i--){ //in case we wanna decrease by two we put i-=2
            System.out.println(i);
        }
    }
}
//3 parts
// 1st inside the parethensis we declare the starter counter/index sequence
// 2nd we set the condition in this case that it will end at 10
// 3rd increment the index