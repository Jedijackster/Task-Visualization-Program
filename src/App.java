import java.util.Scanner;

import methodsPack.Task;



public class App {
    public static void main(String[] args) throws Exception {
        // Calls Scanner for user input
        Scanner inp = new Scanner(System.in);

        System.out.println("Hello! Enter 1 if you would like to create a task breakdown or 0 if you wish to exit. \nEnter here: ");
        int val = inp.nextInt();
        Scanner sc = new Scanner(System.in);
        if (val == 1) {
            Task primTask = new Task();
            System.out.println("Provide primary task name: ");  
            primTask.setName(sc.nextLine());
            System.out.println("Provide primary task description: ");
            primTask.setDescript(sc.nextLine());
            primTask.subSetter();
            primTask.finder();
            

            
        }else if(val== 0){System.out.println("Aborted Program.");
        System.exit(0);
        }
        else {System.out.println("Invalid input. Aborted Program");
        System.exit(0);
        }


    }
}
