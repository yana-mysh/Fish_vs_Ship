public class Fish implements Swimming {

    @Override
    public void swim() {
        eat();
        System.out.println("Я - рыба, и я плаваю.");
    }

    private void eat() {
        System.out.println("Я - рыба, и я кушаю.");
    }
}
