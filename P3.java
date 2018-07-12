/*
 * Purpose: Data Structure and Algorithms Lab 6 Problem 3
 * Status: Complete and thoroughly tested
 * Last update: 10/13/16
 * Submitted:  10/13/16
 * Comment: test suite and sample run attached
 * @author: Brooke Brown
 * @version: 2016.10.13
 */


import java.io.*;
import java.util.*;

public class P3
{
    static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));

    public static void main(String args[]) throws IOException
    {
        ListArrayBasedPlus leftItems = new ListArrayBasedPlus();
        ListArrayBasedPlus rightItems = new ListArrayBasedPlus();
        boolean hasStar = false;
        boolean pal = false;
        boolean sameCon = false;
        int j=0;

        System.out.print("Enter character: ");
        Object newItem  = stdin.readLine().trim();
        System.out.println(newItem);
        for(int i = 0; !(newItem.equals("!")); i++) {
            if(!(newItem.equals("*")) && hasStar == false) {
                leftItems.add(i, newItem);
            }
            else if(newItem.equals("*")) {
                hasStar = true;
            }
            else {
                rightItems.add(j++, newItem);
            }
        System.out.print("Enter character: ");
        newItem  = stdin.readLine().trim();
        System.out.println(newItem);
        }
        if(hasStar) {
            if(leftItems.size() > rightItems.size()) {
                System.out.println("          Left Longer");
            }
            else if(leftItems.size() < rightItems.size()) {
                System.out.println("          Right Longer");
            }
            else {
                for(int i = 0; i < leftItems.size(); i++) {
                    if(leftItems.get(i).equals(rightItems.get(i))) {
                        sameCon = true;
                        if(leftItems.get(i).equals(rightItems.get(rightItems.size() - 1 - i))) {
                            pal = true;
                        }
                        else {
                            pal = false;
                        }
                    }
                    else {
                        sameCon = false;
                    }
                }
                if(pal && sameCon) {
                    System.out.println("          Same Length and Same Content, Palindrome");
                }
                else if((!pal && sameCon) || (leftItems.isEmpty() && rightItems.isEmpty())) {
                    System.out.println("          Same Length and Same Content, No Palindrome");
                }
                else {
                    System.out.println("          Same Length, Different Content");
                }
            }
        }
        else {
            System.out.println("          No Star");
        }
    }
}


