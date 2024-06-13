import java.util.*;

public class parta3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            System.out.println("\nMENU");
            System.out.println("1. Add elements");
            System.out.println("2. Sort elements");
            System.out.println("3. Replace an element");
            System.out.println("4. Remove an element");
            System.out.println("5. Display elements");
            System.out.println("6. Add element between two elements");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of elements to add: ");
                    int n = sc.nextInt();
                    System.out.println("Enter the elements:");
                    for (int i = 0; i < n; i++) {
                        list.add(sc.nextInt());
                    }
                    break;
                case 2:
                    Collections.sort(list);
                    System.out.println("Elements sorted.");
                    break;
                case 3:
                    System.out.print("Enter the element to replace: ");
                    int oldElement = sc.nextInt();
                    System.out.print("Enter the new element: ");
                    int newElement = sc.nextInt();
                    Collections.replaceAll(list, oldElement, newElement);
                    System.out.println("Element replaced.");
                    break;
                case 4:
                    System.out.print("Enter the element to remove: ");
                    int removeElement = sc.nextInt();
                    list.remove(Integer.valueOf(removeElement));
                    System.out.println("Element removed.");
                    break;
                case 5:
                    System.out.println("Elements: " + list);
                    break;
                case 6:
                    System.out.print("Enter the index to add the element: ");
                    int index = sc.nextInt();
                    System.out.print("Enter the element to add: ");
                    int addElement = sc.nextInt();
                    list.add(index, addElement);
                    System.out.println("Element added.");
                    break;
                case 7:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}