package heroes;
import heroes.parent.Character;

public class Hobbit extends Character {
    public Hobbit() {
        super(0, 3);
    }

    @Override
    public void kick(Character c) {
        System.out.println("AAAAAAA");
    }

    @Override
    public String toString() {
        return "Hobbit{hp=" + this.getHp() + ", power=" + this.getPower() + "}";
    }
}
