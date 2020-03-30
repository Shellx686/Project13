package dice;

public class Human extends Player implements RollTheDice{

    public Human (String name){
        super(name);
    }

    public int dropHuman (String name) {
        int dropAl = (int) (Math.random()*16) + 3;
        return dropAl;
    }

    @Override
    public void rollTheDice() {
        System.out.println("Кидаю кости");
    }
}
