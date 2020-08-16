package transient_keyword;

import java.io.*; 
public class TestTransient2 implements Serializable 
{ 
    // Normal variables 
    String a = "JCG";
    String b = "IS"; 
   
    // Transient variables 
    private transient static String c = "GREAT"; 
    transient final String d = "AGAIN!"; 
   
      
    public static void main(String[] args) throws Exception 
    { 
        TestTransient2 foo = new TestTransient2(); 
   
        System.out.println("a before = " + foo.a); 
        System.out.println("b before  = " + foo.b); 
        System.out.println("c before = " + foo.c); 
        System.out.println("d before = " + foo.d); 
         
        System.out.println("---------------------"); 
 
 
        // serialization 
        FileOutputStream fileOutputStream = new FileOutputStream("abc.txt"); 
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream); 
        objectOutputStream.writeObject(foo); 
   
        // de-serialization 
        FileInputStream fileInputStream = new FileInputStream("abc.txt"); 
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream); 
        TestTransient2 output = (TestTransient2) objectInputStream.readObject(); 
        System.out.println("a from file  = " + output.a); 
        System.out.println("b from file  = " + output.b); 
        System.out.println("c from file = " + output.c); 
        System.out.println("d from file = " + output.d); 
 
    }


//    So what happened here? Why were both c and d variables printed? The answer is because both of them were marked as either static or final.
//
//    		static variables are not part of the state of the object so the transient keyword cannot apply.
//    		final variables are already serialized by their values so again transient cannot apply.
//    		So remember this keyword next time you have information you need to loose intentionally when serializing.
    
	
} 