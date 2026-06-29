package SingletonPatternExample;

// public class SingletonTest {
    
//     public static void main(String[] args) {
//         Logger logger1 = Logger.getInstance();
//         logger1.log("This is the first log message.");
        
//         Logger logger2 = Logger.getInstance();
//         logger2.log("This is the second log message.");
        
//         System.out.println("Are both logger instances the same? " + (logger1 == logger2));
//     }
// }
public class SingletonTest {

    public static void main(String[] args) {

        Logger logger1 =Logger.getInstance();
        Logger logger2 =Logger.getInstance();
        Logger logger3 =Logger.getInstance();
        logger1.log("Application Started");
        logger2.log("Loading Data");
        logger3.log("Application Closed");
        System.out.println();
        //verify all reference pointsto the same instance
        System.out.println("logger1 HashCode :" + logger1.hashCode());
        System.out.println("logger2 HashCode :" + logger2.hashCode());
        System.out.println("logger3 HashCode :" + logger3.hashCode());
        if (logger1==logger2 && logger2==logger3) {
            System.out.println("\nOnly one Logger instance exists.");
        } else {
            System.out.println("\nMultiple Logger instances exist.");
        }
    }
}