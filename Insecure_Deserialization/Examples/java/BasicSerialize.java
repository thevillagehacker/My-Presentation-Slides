import java.io.*;

public class BasicSerialize {
  public static void main(String [] args) {
    try {
      Human being = new Human(23, "naveenj", "thevillagehacker");
      String fname = "humandata.ser";
      System.out.println("\nObject is");
      System.out.println(being);
      
      // serializing an object
      FileOutputStream fout = new FileOutputStream(fname);
      ObjectOutputStream oout = new ObjectOutputStream(fout);
      System.out.println("\nSerialization Happening here ...");
      oout.writeObject(being);   // actual serialization
      oout.close();
      fout.close();
      System.out.println("\nThe object was written to " + fname);

      // deserializing an object
      FileInputStream fin = new FileInputStream(fname);
      ObjectInputStream oin = new ObjectInputStream(fin);
      System.out.println("\nDeserialization Happening here ...");
      Human Human = (Human) oin.readObject();   // actual deserialization
      oin.close();
      fin.close();      
      System.out.println("\nThe object was read from " + fname + ":");
      System.out.println(Human);
      System.out.println();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}


import java.io.*;

public class BasicSerialize {
  public static void main(String [] args) {
    try {
      Human being = new Human(23, "naveenj", "thevillagehacker");
      String fname = "humandata.ser";
      System.out.println("\nObject is");
      System.out.println(being);
      
      // serializing an object
      FileOutputStream fout = new FileOutputStream(fname);
      ObjectOutputStream oout = new ObjectOutputStream(fout);
      System.out.println("\nSerialization Happening here ...");
      oout.writeObject(being);   // actual serialization
      oout.close();
      fout.close();
      System.out.println("\nThe object was written to " + fname);

      // deserializing an object
      FileInputStream fin = new FileInputStream(fname);
      ObjectInputStream oin = new ObjectInputStream(fin);
      System.out.println("\nDeserialization Happening here ...");
      Human Human = (Human) oin.readObject();   // actual deserialization
      oin.close();
      fin.close();      
      System.out.println("\nThe object was read from " + fname + ":");
      System.out.println(Human);
      System.out.println();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

