public class NameOverloading {
    static void myMethod(){
        System.out.println("Hello everybody");
    }
    static void myMethod(String FirstName ) {
        System.out.println(FirstName + " Doe");
    }
    static  void myMethod(String FirstName,String Lastname){
        System.out.println(FirstName+" "+ Lastname);
    }
    static void myMethod(String Firstname, String mName, String Lastname){
        System.out.println(Firstname +" "+mName +" "+ Lastname);
    }

    public static void main(String[] args) {
        myMethod();
        myMethod("John");
        myMethod("Harry", "Potter");
        myMethod("Peter", "Harry","Pan");

    }
}
