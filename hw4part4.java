import java.util.Scanner;
public class hw4part4 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Boolean bool = true;
            while(bool) {
            System.out.println("Hello! This program will help you find series to watch. Please enter your name");
            String name;
            name = scan.nextLine();
            System.out.println("Brilliant! Next, choose and enter your favourite series genre\n (fantasy, thriller, science fiction)");
            String gen;
            gen = scan.nextLine();
            System.out.println("And the last: enter your age");
            int age = Integer.parseInt(scan.nextLine());
            String fantasy = "fantasy";
            String thriller = "thriller";
            String sf = "science fiction";
            if(age<=13 && gen.equals(fantasy))
                System.out.println("Your recommended series is Supergirl");
            else if(age<=17&& gen.equals(fantasy))
                System.out.println("Your recommended series is Stranger Things");
            else if(age>=18 && gen.equals(fantasy))
                System.out.println("Your recommended series is The Umbrella academy");
            else if(age<=13&& gen.equals(thriller))
                System.out.println("Your recommended series is The Owl House");
            else if(age<=17&& gen.equals(thriller))
                System.out.println("Your recommended series is Killing Eve");
            else if(age>=18&& gen.equals(thriller))
                System.out.println("Your recommended series is The Haunting of Bly Manor");
            else if(age<=13&& gen.equals(sf))
                System.out.println("Your recommended series is The Mandalorian");
            else if(age<=17&& gen.equals(sf))
                System.out.println("Your recommended series is The 100");
            else if(age>=18&& gen.equals(sf))
                System.out.println("Your recommended series is Orphan Black");
            else
                System.out.println("Please try again and enter data correctly");
            System.out.println("If you want to repeat, type anything, if you want to leave: type leave");
            String con = scan.nextLine();
            if(con.equals("leave"))
            {
                bool = false;
                System.out.println("Goodbye!");}
            }

        }
    }


