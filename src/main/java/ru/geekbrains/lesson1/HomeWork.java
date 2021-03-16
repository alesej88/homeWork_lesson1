package ru.geekbrains.lesson1;

public class HomeWork {
    public static void main(String[] args) {
        int a = 23;
        int b = 45;
        int c = 132;
        int d = 54;
        float r = calcMini(a, b, c, d);
        System.out.println(r);
        int g = celyeChisla(a, b);
        System.out.println(g);
        String s = "Првиет, ";
        String s1 = "Amigo!";
        String s2 = s + s1;
        System.out.println(s2);
        int c1 = chisla(a);
        System.out.println(c1);


    }

    static float calcMini(int a, int b, int c, int d) {
        float result = a * (b + (c / d));
        return result;
    }

    static int celyeChisla(int a, int b) {
        a = 12;
        b = 8;
        int c = a + b;
        if (c >= 10 && c <= 20) {
            System.out.println(true);
        }else if (c <=10 && c>=20){
            System.out.println(false);
        }
        return c;
    }

    static int chisla(int a) {
        a = 5;
        if(a >=0){
            System.out.println("Число положительное");
        }else if (a < 0) {
            System.out.println("Число не положительное");
        }
        return a;
    }
}



