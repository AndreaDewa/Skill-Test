import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String i = scanner.nextLine();

        Character result = NoRepeatCharacter(i);
        if (result != null) {
            System.out.println("The first non-repeating character is : " + result);
        } else {
            System.out.println("All characters repeat, so there is no non-repeating character");
        }

        scanner.close();
    }

    public static Character NoRepeatCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                return str.charAt(i);
            }
        }
        return null;
    }
}

