package linked_list;
import java.util.*;

public class list {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nMENU");
            System.out.println("1. Insert Elements at Specified Position");
            System.out.println("2. Swap Two Elements");
            System.out.println("3. Iterate LinkedList in Reverse Order");
            System.out.println("4. Compare Two LinkedLists");
            System.out.println("5. Convert LinkedList to ArrayList");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    int element = scanner.nextInt();
                    System.out.print("Enter position to insert: ");
                    int position = scanner.nextInt();
                    linkedList.add(position, element);
                    System.out.println("Element " + element + " inserted at position " + position);
                    System.out.println("Inserted elements: " + linkedList);
                    break;
                case 2:
                    System.out.print("Enter first element index to swap: ");
                    int first = scanner.nextInt();
                    System.out.print("Enter second element index to swap: ");
                    int second = scanner.nextInt();
                    Collections.swap(linkedList, first, second);
                    System.out.println("Elements swapped successfully!");
                    System.out.println("New list after swapping: " + linkedList);
                    break;
                case 3:
                    ListIterator<Integer> iterator = linkedList.listIterator(linkedList.size());
                    System.out.println("LinkedList in Reverse Order: " + reverseList(linkedList));
                    break;
                case 4:
                    System.out.println("Enter elements for the second LinkedList (space-separated, -1 to stop):");
                    LinkedList<Integer> linkedList2 = new LinkedList<>();
                    while (true) {
                        int num = scanner.nextInt();
                        if (num == -1) break;
                        linkedList2.add(num);
                    }
                    System.out.println(compareLinkedLists(linkedList, linkedList2) ? "LinkedLists are equal." : "LinkedLists are not equal.");
                    break;
                case 5:
                    System.out.println("LinkedList converted to ArrayList: " + new ArrayList<>(linkedList));
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }

    private static List<Integer> reverseList(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<>(list);
        Collections.reverse(reversedList);
        return reversedList;
    }

    private static boolean compareLinkedLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        List<Integer> sortedList1 = new ArrayList<>(list1);
        List<Integer> sortedList2 = new ArrayList<>(list2);
        Collections.sort(sortedList1);
        Collections.sort(sortedList2);
        return sortedList1.equals(sortedList2);
    }
}
