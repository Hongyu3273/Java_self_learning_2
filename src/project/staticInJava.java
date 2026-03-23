package project;

public class staticInJava {
    public static void main(String[] args){
//        static = make a variable or a method belong to the class
//                rather than to any specific object.
//                commonly used for utility methods or shared resources.
        Friend friend1 = new Friend("SpongeBob");
        Friend friend2 = new Friend("Olive");
        Friend friend3 = new Friend("Max");
        System.out.println(friend1.numOfFriends);
        System.out.println(friend2.numOfFriends);
    }
}
