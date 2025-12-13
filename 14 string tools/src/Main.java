
public class Main{
    public static void main(String[] args){

        String name = "Password";


        //int length = name.length();
        //char letter = name.charAt(0);
        //int index = name.indexOf("a");
        //int lastIndex = name.lastIndexOf("a");

        // name = name.toUpperCase();
        // name = name.toLowerCase();
        // name = name.trim();
        // name = name.replace("o", "a");

        /*

        if (name.isEmpty()){
            System.out.println("Your name is empty");
        }

        else{
            System.out.println("Hello " + name);
        }
        */

        /*
        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }

        else{
            System.out.println("Your name doesn't contains any spaces");
        }

         */


        if(name.equals("password")){
            System.out.println("Your name CAN'T be password");
        }

        else{
            System.out.println("Hello " + name);
        }

    }
}