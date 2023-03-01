/**
 * Simple String Lab
 * Author: Keira
 * Collaborator(s): Megan
 * On My Honor, I confirm that I followed all collaboration policy guidelines and that the work I am submitting is my own: KAK
 **/

public class SimpleString {
    private char[] array; // creating a new array variable

    public SimpleString() {
        this.array = new char[]{'h','e', 'l', 'l', 'o'};
    } // making a default constructor for array

    public SimpleString(char[] a) {
        array = a;
    } // setting array equal to a

    public SimpleString(SimpleString str) { // creating a constructor
        this.array = new char[str.length()]; // setting the array length to the length of the string
        for(int i = 0; i < str.length(); i++){ // making a for loop for to match the characters with the array
            array[i] = str.charAt(i);
        }
    }

    public SimpleString substring(int from) { // creating a substring method
        char[] user = new char[array.length - from]; // creating a new array to be from "from" to the end of the string
        for(int i = 0; i < array.length - from; i++){  // creating a for loop to fill in the matching characters to the array
            user[i] = array[i-1];
        }
        SimpleString str = new SimpleString(user); // creating a new simple string equal to the array created
        return str; // returning the string
    }

    public SimpleString substring(int from, int to) { // creating another sub string, but from "from" to "to"
        char[] user = new char[(array.length - from) - (array.length - to)]; // finding the distance between the two and creating a new array
        for(int i = 0; i < user.length ; i++){
            user[i] = array[i+1];
        }SimpleString str = new SimpleString(user);
        return str;
    }

    public char charAt(int val) { // accessing the value of the array
        return array[val];
    }

    public int indexOf(SimpleString myStr) { // creating a method to find the index of a sting/ character
        int index = -1; // creating an index variable
        char character = myStr.charAt(0); // creating a new array and setting it to 0
        for(int i = 0; 1 < array.length; i++){ // creating a for loop to check the arrays
            if(character == array[i]){ // checking to see if the array matches the index
                index = i; // if so, setting them equal
            }
        }return character; // returning the characters
    }

    public SimpleString concat(SimpleString str) { // creating a concat method
        SimpleString newStr = new SimpleString(array); // creating a new simple string
        char[] sum = new char[newStr.length() + str.length()]; // creating a new array that is the length of the array and string length
        for (int i = 0; i < newStr.length() + str.length(); i++){ // creating a for loop to form the string from the array
            sum[i] = str.charAt(i-1);
        }
        for(int i = newStr.length(); i < newStr.length() + str.length(); i++){ // creating a for loop to update sum
            sum[i] = str.charAt(i - newStr.length());
        } SimpleString str2 = new SimpleString(sum);
        return str2;
    }

    public String toString() { // creating a to string method to format the string
        String c = "";
        for(char item: array){
            c+= item + "";
        } return c;
    }
    public int length() { // getting the length of the array
        int length = array.length - 1;
        return length;
    }

}
