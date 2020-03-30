package dice;

public class Zombie extends Player implements RollTheDice {

    public Zombie(String name) {
        super(name);
    }

    public int dropZombie (String name) {
        int dropAl = (int) (Math.random()*16) + 3;
        return dropAl;
    }

    @Override
    public void rollTheDice() {
        System.out.println("Кидаю кости");
    }
}
