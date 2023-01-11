class HelloWorld {
    public static void main(String[] args) {

        String a="Hello";
        String b="Hello";

         a = new String("Java");  
         b = new String("Java");

         a="Hello";
         b=new String("Hello");
        //  b.intern();

        if(a==b) System.out.println("Noice");
        else System.out.println("Baaad");
    }
}
