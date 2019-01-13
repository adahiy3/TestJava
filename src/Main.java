import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ArrayList<String> al = new ArrayList<>();

        al.add("amit");
        al.add("anju");

        System.out.println("value of list is" + al);

        al.add("ishaan");
        al.add("vihaan");

        System.out.println("value of list is" + al);

        //iterate over the list
        for (String names: al
             ) {
            System.out.println(names);
        }

    }
}
