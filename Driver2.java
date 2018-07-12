
/* Purpose: Data Structure and Algorithms Lab 6 Problem 2
 * Status: complete and fully tested
 * Last update: 10/10/16
 * Submitted: 10/10/16
 * Comment: sample run attached
 * @author: Brooke Brown
 * @version: 2016.10.05
 */

import java.io.*;
import java.util.*;

public class Driver2
{
    static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));

    public static void main(String args[]) throws IOException
    {
        Deq<Object> list = new Deq<Object>();

        String askPrompt =  "   1. Insert item at back of Deq.\n   2. Insert item at front of Deq. \n   3. Remove item from front of Deq.\n   4. Remove item from back of Deq. \n   5. Display front item of Deq.\n   6. Display last item of Deq.\n   7. Clear Deq.\n   8. Display content of Deq. \n   9. Exit program. \nMake your menu selection now: ";
        System.out.print(askPrompt);
        int answer = Integer.parseInt(stdin.readLine().trim());
        System.out.println(answer);
        while(answer != 9) {
            switch (answer) {
            case 1: //insert item at back of deq
                System.out.print("   Enter item: ");
                Object item  = stdin.readLine().trim();
                System.out.println(item);
                list.enqueue(item);
                System.out.println("Item " + item  + " inserted at back of Deq.");
                System.out.print(askPrompt);
                answer = Integer.parseInt(stdin.readLine().trim());
                System.out.println(answer);
                break;
            case 2: //insert item at front of deq
                System.out.print("   Enter item: ");
                item  = stdin.readLine().trim();
                System.out.println(item);
                list.enqueueFirst(item);
                System.out.println("Item " + item  + " inserted at front of Deq.");
                System.out.print(askPrompt);
                answer = Integer.parseInt(stdin.readLine().trim());
                System.out.println(answer);
                break;
            case 3: //remove item from front of deq
                if(list.isEmpty()) {
                    System.out.println("Error. List is empty.");
                }
                else {
                    System.out.println("Item " + list.dequeue() + " removed from front of Deq.");
                }
                System.out.print(askPrompt);
                answer = Integer.parseInt(stdin.readLine().trim());
                System.out.println(answer);
                break;
            case 4: //remove item from back of deq
                if(list.isEmpty()) {
                    System.out.println("Error. List is empty.");
                }
                else {
                    System.out.println("Item " + list.dequeueLast() + " removed from back of Deq.");
                }
                System.out.print(askPrompt);
                answer = Integer.parseInt(stdin.readLine().trim());
                System.out.println(answer);
                break;
            case 5: //get item from top of deq
                if(list.isEmpty()) {
                    System.out.println("Error. List is empty.");
                }
                else {
                    System.out.println("Item " + list.peek() + " retrieved from top of Deq.");
                }
                System.out.print(askPrompt);
                answer = Integer.parseInt(stdin.readLine().trim());
                System.out.println(answer);
                break;
            case 6: //get item from bottom of deq
                if(list.isEmpty()) {
                    System.out.println("Error. List is empty.");
                }
                else {
                    System.out.println("Item " + list.peekLast() + " retrieved from bottom of Deq.");
                }
                System.out.print(askPrompt);
                answer = Integer.parseInt(stdin.readLine().trim());
                System.out.println(answer);
                break;
            case 7: //clear list
                list.dequeueAll();
                System.out.print(askPrompt);
                answer = Integer.parseInt(stdin.readLine().trim());
                System.out.println(answer);
                break;
            case 8:
                System.out.println(list.toString());
                System.out.print(askPrompt);
                answer = Integer.parseInt(stdin.readLine().trim());
                System.out.println(answer);
                break;
            default:
                System.out.println("Oh no! You put an incorrect number. Try again!");
                System.out.print(askPrompt);
                answer = Integer.parseInt(stdin.readLine().trim());
                System.out.println(answer);
                break;
            }
        }
        System.out.print("Exiting program... Good Bye!");
    }
}
