package ArraysPractice;

public class StringPrac {
    public static void main(String[] args) {

        char c1 = 'A';
     

        String s1 = new String("Welcome to Java");
	    String s2 = "Welcome";
        String s3 = "to the world";

        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s2.concat(s3));
        
        String s4 = s1 + " " + s2 + " " + s3;
        System.out.println(s4);

        String s5 = s1.substring(11, 15);
        System.out.println(s5);

        // if (s1.equals(s2)){  
        //     // s1 and s2 have the same contents  
        //     System.out.println("s1 and s2 have the same contents ");
        //   }
         
        //   if (s1 == s2) {
        //     // s1 and s2 have the same reference 
        //     System.out.println("s1 and s2 have the same reference ");
        //   }

        //   if (s1.compareTo(s2) > 0) {  
        //     // s1 is greater than s2 
        //     System.out.println("s1 is greater than s2 ");
        //   }
        //   else if (s1.compareTo(s2) == 0) { 
        //     // s1 and s2 have the same contents 
        //     System.out.println("s1 and s2 have the same contents  ");
        //   }
        //   else 
        //      // s1 is less than s2
        //      System.out.println(" s1 is less than s2 ");
        

    }
}
