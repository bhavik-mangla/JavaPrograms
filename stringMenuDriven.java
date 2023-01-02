import java.util.Scanner;

class stringMenuDriven {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String ch = in.nextLine();
        int sum = 0;
        int n = ch.length();
        for (int i = 1; i < n; i++) {
            char character = ch.charAt(i);
            switch (character) {
                case 'a':
                    sum++;
                    break;
                case 'e':
                    sum++;
                    break;
                case 'i':
                    sum++;
                    break;
                case 'o':
                    sum++;
                    break;
                case 'u':
                    sum++;
                    break;
                case 'A':
                    sum++;
                    break;
                case 'E':
                    sum++;
                    break;
                case 'I':
                    sum++;
                    break;
                case 'O':
                    sum++;
                    break;
                case 'U':
                    sum++;
                    break;
            }
        }
        System.out.println("Number of vowels in the string = " + sum);
    }
}
