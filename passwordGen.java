import java.util.Scanner;

public class passwordGen {
    Scanner scanner = new Scanner(System.in);

    void check() {
        Scanner scann = new Scanner(System.in);
        String check = "1,2,3,4,5,6,7,8,9,0,@,_";
        String a;
        boolean b = true;
        System.out.println("Enter your password :");
        String password = scann.nextLine();
        if (password.length() <= 5) {
            System.out.println("weak");
            System.out.println(" Press '1' to Generate new password");
            int checking = scanner.nextInt();
            if (checking == 1) {
                input();
            }
        } else if (password.length() <= 8) {
            if (password.equals("12345678") | password.equals("11223344")) {
                System.out.println("weak");
            } else {
                for (int i = 0; i < check.length() - 1; i++) {
                    a = String.valueOf(check.charAt(i));
                    // name.charAt(i);
                    if (password.contains(a)) {
                        System.out.println("Strong");
                        b = true;
                        break;
                    } else {
                        b = false;
                    }
                }
                if (b == false) {
                    System.out.println("Normal");
                }
            }
            System.out.println(" Press '1' to Generate new password");
            int checking = scanner.nextInt();
            if (checking == 1) {
                input();
            }
        } else {

            if (password.equals("1122334455") | password.contains("123456789")) {
                System.out.println("weak");
            } else {
                System.out.println("Strong");
            }
        }
        System.out.println(" Press '1' to Generate new password");
        int checking = scanner.nextInt();
        if (checking == 1) {
            input();
        }
    }

    void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your First name:");
        String f_name = input.nextLine();
        System.out.println("Enter your Last name :");
        String s_name = input.nextLine();
        System.out.println("\n");
        call(f_name, s_name);
    }

    void call(String first, String second) {

        for (int j = 0; j < 5; j++) {
            create(first, second);
        }
        System.out.println(" \n \t  1.Regenerate");
        Scanner scan = new Scanner(System.in);
        int input;
        input = scan.nextInt();
        if (input == 1) {
            System.out.println("\n");
            call(first, second);
        }

    }

    void create(String firstname, String secondname) {

        String userid = firstname;

        String userid2 = secondname;
        String fianlpass;
        float num = (float) Math.random() * 10;
        float num2 = (float) Math.random() * 1000;
        float num3 = (float) Math.random() * 100;
        int finalnum3 = (int) num3;
        // System.out.println(finalnum3);
        int finalnum2 = (int) num2;
        // System.out.println(num2);
        int finalnum = (int) num;
        // System.out.println(finalnum);
        if (finalnum <= 5) {
            if (finalnum2 <= 500) {
                fianlpass = userid + (finalnum + "" + finalnum3);
                // System.out.println(fianlpass);
            } else if (finalnum2 <= 700) {
                fianlpass = userid2 + +finalnum2;
            } else {
                fianlpass = userid + userid2 + finalnum3;
            }
            // System.out.println(fianlpass);
        } else if (finalnum <= 8) {
            if (finalnum2 <= 500) {
                fianlpass = userid2 + "@" + (finalnum + finalnum3);
            } else if (finalnum2 <= 700) {
                fianlpass = userid2 + userid + "@" + finalnum2;
            } else {
                fianlpass = userid + "@" + finalnum3;
            }

        } else {
            if (finalnum2 <= 500) {
                fianlpass = userid2 + "0" + (finalnum + finalnum3);
            } else if (finalnum2 <= 700) {
                fianlpass = userid2 + userid + "01" + finalnum2;
            } else {
                fianlpass = userid + userid2 + "02" + finalnum3;
            }
        }
        System.out.println(fianlpass);

    }

    public static void main(String[] args) {
        passwordGen ps = new passwordGen();
        ps.check();
    }
}
