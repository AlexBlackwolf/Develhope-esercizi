package BroCodeCourse.TWODArray;
//2D array = an array of arrays
//think of it as a parking lot with rows and columns
public class Main {
    public static void main(String[] args) {
        String[][] fromSoftWare = new String[2][3];

        fromSoftWare[0][0] = "Dark souls";
        fromSoftWare[0][1] = "Dark souls 2";
        fromSoftWare[0][2] = "Dark souls 3";
        fromSoftWare[1][0] = "BloodBorne";
        fromSoftWare[1][1] = "Sekiro";
        fromSoftWare[1][2] = "Elden ring";

        for(int i=0; i<fromSoftWare.length;i++) {
            System.out.println();
            for(int j=0;j<fromSoftWare[i].length;j++) {
                System.out.println(fromSoftWare[i][j]+ " ");
            }
        }
        //u can also make the array by adding the values at the begening
        //Ex
        String[][]monsterHunter = {
                {"mh1", "mh2", "mh3", "mh4"},
                {"mhw","mhr"}
        };
    }
}
