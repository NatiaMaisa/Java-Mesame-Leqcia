package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Java for Loops ლუპები

        for (int i = 0; i < 3; i++) {
            System.out.println("Testing"); //ბეჭდავს Testing-ს 3-ჯერ
        }

        int i = 0;  // გარეთ გამოცხადებაც შეგვეძლია
        for (; i <= 10; i = i + 2) {
            System.out.println(i); // მხოლოდ ლუწ რიცხვებს ბეჭდავს 10-ის ჩათვლით
        }
        System.out.println(i); // აქ უკვე 12აც დაბეჭდავს რადგან ტანის გარეთ გამოვა როცა ზემოთ აღარ შესრულდება

        for (i = 10; i >= 0; i--) {
            System.out.println(i); // კლებადობით დაბეჭდავს 10-დან 0-ის ჩათვლით
        }

        // ჩადგმული ლუპები Nested Loops: პირველ იტერაციას რომ შეასრულებს მიადგება მეორე For-ს
        // და როცა მეორე For -ის ყველა იტერაციას დაასრულებს ამოვა ისევ პირველში დაა ასე გააგრძელებს

        for (i = 0; i <= 2; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < 5; j++) {
                System.out.println("      j = " + j);
            }
        }

        // Java Break & Continue

        for (i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) break; //როცა i უნაშთოდ გაიყოფა 3-ზე და 5-ზე შეწყვიტოს ციკლი
            System.out.println("i= " + i);
        }
        for (i = 0; i < 5; i++) {
            if (i == 3) continue; // როცა i გაუტოლდება 3-ს არ დაბეჭდოს და გააგრძელოს მომდევნო იტერაცია
            System.out.println(i);
        }

        //String in Loop

        //System.out.println(s.length()); ------ სიგრძე 1 დან ითვლება
        //System.out.println(s.charAt(1)); ------ პოზიცია 0 დან ითვლება

        String s = "Software Testing";
        for (i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }

        // Java while Loops ლუპები

        int j = 0;  // გამოცხადება ხდება გარეთ
        while (j < 5) {
            System.out.println("Testing");
            j++; // ეს თუ გამოგვრჩება კოდი ჩაიციკლება
        }

        //while break & continue

        int q = 0;
        while (q < 5) {
            if (q == 3) break; // 3-ის ტოლი რომ იქნება ციკლი შეწყდება
            System.out.println(q);
            q++;
        }

        int w = 0;
        while (w < 5) {
            if (w == 3) {
                w++;
                continue; // 3-ის ტოლი რომ იქნება არ დაბეჭდავს და გააგრძელებს იტერაციას
            }
            System.out.println(w);
            w++;
        }

        int e = 0;
        int r = 7;
        while (e < 5 && r >= 4) {
            System.out.println(e + r);
            e++;
            r = r - 2;
        }

        int y = 3;
        for (int t = 0; t < 10 && y <= 5; t ++){
            System.out.println(t + y);
            y ++;
        }

        //for ციკლის მსგავსად while -თაც შეგვიძლია ვემუშაოთ String -ს და გავიგოთ
        //რომელ პოზიციაზე რომელი სიმბოლო დგას

        String o = " I Love testing";
                int u = 0;
                while(u < o.length()){
                    System.out.println(o.charAt(u)); //charAt() method returns the character at the specified index in a string.
               u++;
                }


                Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანეთ სასურველი მნიშვნელობა. თუ შეიყვანთ 0 -ს პროცესი დასრულდება");
                int number = scanner.nextInt();
                while(number != 0){
                    System.out.println("თქვენ შეიყვანეთ " + number);
                    number=scanner.nextInt();
                }
        System.out.println("თქვენ შეიყვანეთ 0 და პროცესი დასრულდა");

        //While Nested Loop ჩადგმული

        int p = 0;
        while (p < 3){
            System.out.println("p = " + p);
            p++;

            int d = 0;
            while (d < 5) {
                System.out.println("    d = " + d);
                d++;}
        }

        //Array - მასივი
        int [] array = {3, 5, 7, 8, 9, -5};
        System.out.println(array[2]);
        System.out.println(array.length);

        for (int f = 0; f < array.length; f ++){
            System.out.println(array[f]);
        }

        String [] stringArray = {"Lika", "Sali", "Dato", "Levani"};
        System.out.println(stringArray[1]);

        int g = 0;
       while (g < stringArray.length){
        System.out.println(stringArray[g]);
        g++;}

     //Change an Array Element
        String [] names = {"Lika", "Sali", "Dato", "Levani"};
        names [1] = "Ani";
        System.out.println(names[1]); //Sali-ს ნაცვლად დაიბეჭდება Ani


        //ცარიელი მასივის შექმნა
        //○ byte, short, long, int - 0
        //○ float, double - 0.0
        //○ String - null
        //○ boolean - false

        String [] strArray = new String[5];
        strArray[2]= "Natia"; // მე-2-ე ინდექს პოზიციაზე მყოფს მივანიჭე,
        // ამიტომ დანარჩენზე ისევ null, ხოლო index 2-ზე Natia დაიბეჭდება
        for  (int k = 0; k < strArray.length; k++){
            System.out.println(strArray[k]); //დაბეჭდავს null (სიცარიელე) რადგან მასივი არის String
        }
    }
}