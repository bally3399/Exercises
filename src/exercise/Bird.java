package exercise;

public class Bird extends Animal {
    String fly(){
        return "I am flying";
    }
    String sing(){
        return "I am singing";
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
    }
}
