/*
 * Purpose: Data Structure and Algorithms Lab 2 Problem 1. b.
 * Status: Complete and thoroughly tested
 * Last update: 09/18/16
 * Submitted:  09/18/16
 * Comment: test suite and sample run attached
 * @author: Brooke Brown
 * @version: 2016.09.14
 */

public class ListArrayBasedPlus extends ListArrayBased
{

    public ListArrayBasedPlus()
    {
        super();
    }

    public void add(int index, Object item)
    {
        if(items.length == numItems) {
            resize();
        }
        super.add(index, item);
    }

    public void resize()
    {
        Object []temp = new Object[items.length + items.length];
        for(int index = 0; index < numItems; index++) {
            temp[index] = items[index];
        }
        items = temp;
    }

    public void reverse()
    {   //NO METHODS
        Object temp1, temp2 = new Object();
        for(int index = 0, pos = numItems - 1; index <= pos; index++, pos--) {
            temp1 = super.get(index);
            temp2 = super.get(pos);;
            items[pos] = temp1;
            items[index] = temp2;
        }
    }

    public String toString()
    {
        String output = new String();
        for(int i = 0; i < super.size(); i++) {
            output = output + super.get(i) + " ";
        }
        return output;
    }
}
