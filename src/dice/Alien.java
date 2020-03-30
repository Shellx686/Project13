package dice;

public class Alien extends Player implements RollTheDice {

    public Alien(String name) {
        super(name);
    }

    public int dropAlien (String name) {
        int dropAl = (int) (Math.random()*16) + 3;
        return dropAl;
    }



    @Override
    public void rollTheDice() {
        System.out.println("Кидаю кости");
    }
}
