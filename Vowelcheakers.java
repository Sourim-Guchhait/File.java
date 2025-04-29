//WAP a programme to take a chracter from user and check wheather it is a vowel or not using..... conditional operator.

import java.util.Scanner;
class Vowelcheakers {

    static public void main(String[] args )
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a character : " );
        char ch = Sc.next().charAt(0);

        String result=(ch=='a' ||ch=='e' || ch== 'i' || ch== 'o' || ch=='u') ? "users is a vowel checkers" : "users not a vowelcheckers";
        System.out.println(result);
}
}