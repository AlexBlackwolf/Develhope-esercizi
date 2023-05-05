package BroCodeCourse.TWODArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //2d Arraylist a list of separate lists
        //you can change the size of these lists during runtime
        ArrayList<ArrayList<String>> shoppingList = new ArrayList<>();
        ArrayList<String> gamesList = new ArrayList<>();
        gamesList.add("monster hunter rise");
        gamesList.add("code vein");
        ArrayList<String> accessoriesList = new ArrayList<>();
        accessoriesList.add("keyboard");
        accessoriesList.add("gamepad");
        ArrayList<String> mangaList = new ArrayList<>();
        mangaList.add("berserk");
        //add the arrayList inside the shoppingList
        shoppingList.add(gamesList);
        shoppingList.add(accessoriesList);
        shoppingList.add(mangaList);

        System.out.println(gamesList);
        //to get a specific index
        System.out.println(gamesList.get(0));
        System.out.println(mangaList);
        //retrieve only one list command by using index
        System.out.println(shoppingList.get(0).get(1));
        System.out.println(shoppingList.get(2).get(0));
    }
}
