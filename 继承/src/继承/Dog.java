package 继承;

public class Dog extends Animal{
	
	@Override
	public void eat() {
		super.eat();
		System.out.println("狗吃食.");
	}
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.eat();
	}
}
