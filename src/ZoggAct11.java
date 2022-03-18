import java.util.Scanner;

public class ZoggAct11 {
    public static void main(String[] args) {
        System.out.println("Enter your first name ");
        Scanner first = new Scanner(System.in);
        String firstname = first.nextLine();

        System.out.println("Enter your middle initial ");
        Scanner second = new Scanner(System.in);
        char middleinitial = second.next().charAt(0);

        System.out.println("Enter your last name ");
        Scanner last = new Scanner(System.in);
        String lastname = last.nextLine();

        System.out.println("Enter your birthdate (Month day, Year)");
        Scanner bday = new Scanner(System.in);
        String birthday = bday.nextLine();
        String[] yourage = birthday.split(", ", 2);
        int currentyear = 2022;
        int age = currentyear - Integer.parseInt(yourage[1]);

        System.out.println("Enter the number of people in your household ");
        Scanner number = new Scanner(System.in);
        int numberhousehold = number.nextInt();

        System.out.println("Enter your annual salary ");
        Scanner salar = new Scanner(System.in);
        Double annual = salar.nextDouble();

        System.out.println("Enter your sex(Male/Female) ");
        Scanner s = new Scanner(System.in);
        String sex = s.next();


        System.out.println("Enter your address ");
        Scanner address = new Scanner(System.in);
        String addy = address.nextLine();

        String refer = "";
        switch (sex) {

            case "male":
            case "Male":
                refer = "Mr.";
                break;

            case "female":
            case "Female":
                refer = "Ms.";
                break;


        }
        System.out.println("Enter your contact number ");
        Scanner numbercontact = new Scanner(System.in);
        String num = numbercontact.nextLine();
        int maxLength = 11;
        if (num.length() > maxLength)
            num = num.substring(0, maxLength);

           System.out.println("Enter your email ");
        Scanner email = new Scanner(System.in);
        String ema = numbercontact.nextLine();
        boolean result = ema.matches("[@,.com]+");

        if (result == true) {
            String ema2 = ema;
        }
        else{
            System.out.println("Invalid email");
        }

        System.out.println("Enter password ");
        Scanner password = new Scanner(System.in);
        String pass = numbercontact.nextLine();
        boolean result = ema.matches("[1,.com]+");

        if (result == true) {
            String ema2 = ema;
        }
        else{
            System.out.println("Invalid email");
        }





        /* public class Example {
    public static void main(String[] args){
        String str = "abcdABCD";
        boolean result = str.matches("[a-zA-Z]+");
        System.out.println("Original String : " + str);
        System.out.println("Does string contain only Alphabets? : " + result);
    }

    String myString = "myString";
int maxLength = 3;
if (myString.length() > maxLength)
     myString = myString.substring(0, maxLength);
}
        } */


            System.out.println("\nWelcome, " + refer + " " + firstname + " " + middleinitial + "." + lastname + " to our system. Your birthdate is " + birthday + ", and you are " + age +
                    " years old, your gender is " + sex + "\nand you reside in " + addy + ". The total number of people in your household is " + numberhousehold +
                    " and your annual salaray is PHP " + annual + "0.");





    }
}

