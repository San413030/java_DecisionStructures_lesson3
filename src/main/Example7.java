package main;

public class Example7 {
    public static void main(String[] args) {
        int x=10;
        switch(x) {
            case 10, 20, 40 ->System.out.println(200);
            case 50 -> System.out.println(400);
        }

        int y=switch(x){
            case 10, 20, 40 -> 100;
            case 50 -> 200;
            default -> 600;
        };
        System.out.println(y);

    }
}
