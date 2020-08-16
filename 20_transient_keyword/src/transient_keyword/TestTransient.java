package transient_keyword;

import java.io.*; 
public class TestTransient implements Serializable 
{ 
    /**
	 * Transient is basically a variables modifier that used for serialization. 
	 * Now, what is Serialization? Serialization in Java is a mechanism that is used in converting the state of an object into a byte stream. 
	 * At the time of serialization, if you don’t want to save the value of a particular variable in a file, then use the transient keyword.
	 */
	private static final long serialVersionUID = 1L;
	// Normal variables 
    String a = "JCG";
    String b = "IS"; 
   
    // Transient variables 
    transient String c = "GREAT"; 
   
      
    public static void main(String[] args) throws Exception 
    { 
        TestTransient foo = new TestTransient(); 
   
        System.out.println("a before = " + foo.a); 
        System.out.println("b before  = " + foo.b); 
        System.out.println("c before = " + foo.c); 
         
        System.out.println("---------------------"); 
 
 
        // serialization 
        FileOutputStream fileOutputStream = new FileOutputStream("abc.txt"); 
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream); 
        objectOutputStream.writeObject(foo); 
        objectOutputStream.close();
   
        // de-serialization 
        FileInputStream fileInputStream = new FileInputStream("abc.txt"); 
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream); 
        TestTransient output = (TestTransient) objectInputStream.readObject(); 
        System.out.println("a from file  = " + output.a); 
        System.out.println("b from file  = " + output.b); 
        System.out.println("c from file = " + output.c); 
        objectInputStream.close();
 
        
    } 
} 
