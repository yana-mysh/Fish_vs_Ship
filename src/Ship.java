public class Ship implements Swimming {

    @Override
    public void swim() {
        fuel();
        System.out.println("Я - корабль, и я плаваю.");
    }

    private void fuel() {
        System.out.println("Я - корабль, и меня запрвляют топливом.");
    }

}
