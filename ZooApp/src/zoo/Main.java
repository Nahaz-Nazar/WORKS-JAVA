package zoo;

public class Main {
    public static void main(String[] args) {
    	
        Animal bird = new Bird();
        Animal dog = new Dog();

        bird.makeSound();
        bird.move();
        dog.makeSound();
        dog.move();
    }
}
