package interface_abstract.markerInterface;

import java.io.*;

// By implementing Serializable interface
// we make sure that state of instances of class A
// can be saved in a file.
class A2 implements Serializable
{
    int i;
    String s;

    // A class constructor
    public A2(int i,String s)
    {
        this.i = i;
        this.s = s;
    }
}

public class Serializablee
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        A a = new A(20,"GeeksForGeeks");

        // Serializing 'a'
        FileOutputStream fos = new FileOutputStream("xyz.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);

        // De-serializing 'a'
        FileInputStream fis = new FileInputStream("xyz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        A b = (A)ois.readObject();//down-casting object

        System.out.println(b.i+" "+b.s);

        // closing streams
        oos.close();
        ois.close();
    }
}

//Serializable interface :
// Serializable interface is present in java.io package.
// It is used to make an object eligible for saving its state into a file.
// This is called Serialization.
//Classes that do not implement this interface will not have any of their state serialized or deserialized.
// All subtypes of a serializable class are themselves serializable.