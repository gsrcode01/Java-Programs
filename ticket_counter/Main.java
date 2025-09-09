package ticket_counter;
import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Stack st = null;

            System.out.println("Choose initialization:");
            System.out.println("1. Empty stack with size");
            System.out.println("2. Stack initialized with array of Persons");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter size: ");
                int size = sc.nextInt();
                st = new Stack(size);
            } else if (choice == 2) {
                System.out.print("Enter number of Persons: ");
                int n = sc.nextInt();
                Person arr[] = new Person[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("Enter details for Person " + (i + 1) + ":");
                    System.out.print("Person Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    System.out.print("Gender (MALE, FEMALE, OTHER): ");
                    Person.Gender gender = Person.Gender.valueOf(sc.next().toUpperCase());
                    arr[i] = new Person(name, age, gender);
                }
                st = new Stack(arr);
            }

            int option;
            do {
                System.out.println("\n--- Menu ---");
                System.out.println("1. Push one Person");
                System.out.println("2. Push two Persons");
                System.out.println("3. Pop one Person");
                System.out.println("4. Pop multiple Persons");
                System.out.println("5. Display all Persons");
                System.out.println("6. Display top n Persons");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");
                option = sc.nextInt();

                switch(option) {
                    case 1:
                        System.out.print("Enter name: ");
                        String name1=sc.next();
                        System.out.print("Enter age: ");
                        int age1=sc.nextInt();
                        System.out.print("Enter gender (MALE, FEMALE, OTHER): ");
                        Person.Gender gender1 = Person.Gender.valueOf(sc.next().toUpperCase());
                        st.push(new Person(name1, age1, gender1));
                        break;

                    case 2:
                        System.out.println("Enter details for first person:");
                        System.out.print("Name: ");
                        String name2_1=sc.next();
                        System.out.print("Age: ");
                        int age2_1=sc.nextInt();
                        System.out.print("Gender (MALE, FEMALE, OTHER): ");
                        Person.Gender gender2_1 = Person.Gender.valueOf(sc.next().toUpperCase());
                        Person p1 = new Person(name2_1, age2_1, gender2_1);
                        System.out.println("Enter details for second person:");
                        System.out.print("Name: ");
                        String name2_2 = sc.next();
                        System.out.print("Age: ");
                        int age2_2 = sc.nextInt();
                        System.out.print("Gender (MALE, FEMALE, OTHER): ");
                        Person.Gender gender2_2 = Person.Gender.valueOf(sc.next().toUpperCase());
                        Person p2 = new Person(name2_2, age2_2, gender2_2);
                        st.push(p1, p2);
                        break;

                    case 3:
                        Person popped = st.pop();
                        if (popped != null) popped.display();
                        break;

                    case 4:
                        System.out.print("Enter number of Persons to pop: ");
                        int n = sc.nextInt();
                        st.pop(n);
                        break;

                    case 5:
                        st.display();
                        break;

                    case 6:
                        System.out.print("Enter number of top Persons: ");
                        int topN = sc.nextInt();
                        st.display(topN);
                        break;

                    case 7:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }
            } while(option != 7);
        }
    }

