
public class Main43 {
    public static void main(String[] args){

        // static = Makes a variable or method belong to the class
        //          rather than to any specific object.
        //          Commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("Tai Tai");
        Friend friend2 = new Friend("Scob");
        Friend friend3 = new Friend("Deliria");
        Friend friend4 = new Friend("Putinera");

        System.out.println(Friend.numOfFriends);
        System.out.println(friend2.numOfFriends);

        Friend.showFriends();

        Math.round(4.52);

    }
}