public class Goblin extends Creature implements Fighting {

    public Goblin() {
        super("Goblin", 10, 20);
    }


    @Override
    public void attack(Creature enemy) {
        super.attack(enemy);

    }
}
