
/* Purpose: Data Structure and Algorithms Lab 6 Problem 1
 * Status: complete and fully tested
 * Last update: 10/10/16
 * Submitted: 10/10/16
 * Comment: sample run attached
 * @author: Brooke Brown
 * @version: 2016.10.05
 */

import java.io.*;
import java.util.*;

public class Driver1
{
    static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));

    public static void main(String args[]) throws IOException
    {
        QueueArrayBased<Object> list = new QueueArrayBased<Object>();

        String askPrompt =  "   1. Insert item at back of queue.\n   2. Remove item from front of queue.\n   3. Display front item of queue.\n   4. Clear queue.\n   5. Display content of queue. \n   6. Exit program. \nMake your menu selection now: ";
        System.out.print(askPrompt);
        int answer = Integer.parseInt(stdin.readLine().trim());
        System.out.println(answer);
        while(answer != 6) {
            switch (answer) {
            case 1: //insert item at back of queue
                System.out.print("   Enter item: ");
                Object item  = stdin.readLine().trim();
                System.out.println(item);
                list.enqueue(item);
                System.out.println("Item " + item  + " inserted onto queue.");
                System.out.print(askPrompt);
                answer = Integer.parseInt(stdin.readLine().trim());
                System.out.println(answer);
                break;
            case 2: //remove item from stack
                if(list.isEmpty()) {
                    System.out.println("Error. List is empty.");
                }
                else {
                    System.out.println("Item " + list.dequeue() + " removed from queue.");
                }
                System.out.print(askPrompt);
                answer = Integer.parseInt(stdin.readLine().trim());
                System.out.println(answer);
                break;
            case 3: //get item from top of queue
                if(list.isEmpty()) {
                    System.out.println("Error. List is empty.");
                }
                else {
                    System.out.println("Item " + list.peek() + " retrieved from top of queue.");
                }
                System.out.print(askPrompt);
                answer = Integer.parseInt(stdin.readLine().trim());
                System.out.println(answer);
                break;
            case 4: //clear list
                list.dequeueAll();
                System.out.print(askPrompt);
                answer = Integer.parseInt(stdin.readLine().trim());
                System.out.println(answer);
                break;
            case 5:
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
