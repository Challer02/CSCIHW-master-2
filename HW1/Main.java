package HW1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start of Main");
        // Create an object that will make a Pyramid (see Pyramid.java for more info)

        // Create an object that implements a method which will take an name, age, and favorite color and will return a story (see Adlibs.java for more info)
        
        // Create an object that implements a method which will  accept a string, an integer, and a char and will replace the char in the string at the given integer (See Replace.java for more info)
        Pyramid.Output();
        Adlibs a = new Adlibs();
        String name ="Chase";
        int age = 19;
        String favoriteColor = "Blue";
        System.out.println("Hello, ny name is "+name+" and I am "+age+" and my favorite color is "+favoriteColor);
        Replace r = new Replace();
        String s = "Chose";
        int x = 2;
        char z = 'a';
        System.out.println(s.substring(0, x) + z + s.substring(x+1));



    }
}
